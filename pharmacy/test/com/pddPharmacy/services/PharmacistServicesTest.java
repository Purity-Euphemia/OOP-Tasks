package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Category;
import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.models.Type;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.request.AddDrugRequest;
import com.pddPharmacy.dtos.request.BuyDrugsRequest;
import com.pddPharmacy.exceptions.InvalidDrugQuantityException;
import com.pddPharmacy.testutils.TestDataFactory;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.pddPharmacy.data.models.Category.ANALGESIC;
import static com.pddPharmacy.data.models.Category.ANTIBIOTIC;
import static org.junit.jupiter.api.Assertions.*;

class PharmacistServicesTest {
    private PharmacistServices pharmacistServices;
    private Drugs drugs;

    @BeforeEach
    public void setUp() {
        drugs = new Drugs();
        pharmacistServices = new PharmacistServices();
    }
    @Test
    public void addDrug_drugCountIsOneTest() {
        AddDrugRequest addDrugRequest= new AddDrugRequest();
        addDrugRequest.setName("Panadol");
        addDrugRequest.setCategory(Category.ANALGESIC);
        addDrugRequest.setQuantity(5);
        addDrugRequest.setType(Type.CAPSULE);
        addDrugRequest.setManufactureOn(LocalDate.now());
        addDrugRequest.setExpiry(addDrugRequest.getManufactureOn().plusMonths(5));
        pharmacistServices.addDrug(addDrugRequest);
        assertEquals(1L,drugs.count());
    }
    @Test
    public void addDrugWithZeroQuantity_throwsException() {
        AddDrugRequest addDrugRequest = new AddDrugRequest();
        addDrugRequest.setName("Panadol");
        addDrugRequest.setCategory(Category.valueOf("ANALGESIC"));
        addDrugRequest.setQuantity(0);
        addDrugRequest.setType(Type.CAPSULE);
        addDrugRequest.setManufactureOn(LocalDate.now());
        addDrugRequest.setExpiry(addDrugRequest.getManufactureOn().plusMonths(5));
        assertThrows(InvalidDrugQuantityException.class, () -> PharmacistServices.addDrug(addDrugRequest));
        assertEquals(0,drugs.count());
    }
    @Test
    public void buyDrugs_quantityReducesTest() {
        AddDrugRequest addDrugRequest = new AddDrugRequest();
        addDrugRequest.setName("Panadol");
        addDrugRequest.setCategory(Category.valueOf("ANALGESIC"));
        addDrugRequest.setQuantity(15);
        addDrugRequest.setType(Type.valueOf("CAPSULE"));
        addDrugRequest.setManufactureOn(LocalDate.now());
        addDrugRequest.setExpiry(addDrugRequest.getManufactureOn().plusMonths(5));
        pharmacistServices.addDrug(addDrugRequest);
        assertEquals(1L,drugs.count());

        BuyDrugsRequest panadol = new BuyDrugsRequest();
        panadol.setDrugName("Panadol");
        panadol.setQuantity(15);

        BuyDrugsRequest phensic = new BuyDrugsRequest();
        phensic.setDrugName("Phensic");
        phensic.setQuantity(3);

        assertEquals(2, pharmacistServices.getAvailableDrugs().size());

        pharmacistServices.buyDrugs(phensic);
        pharmacistServices.buyDrugs(panadol);
        assertEquals(1, pharmacistServices.getAvailableDrugs().size());
        assertEquals(9,pharmacistServices.getAvailableDrugs().size());
    }
    @Test
    public void availableDrugsCanBeFoundTest() {
        AddDrugRequest panadol = new AddDrugRequest();
        panadol.setName("Panadol");
        panadol.setCategory(Category.valueOf("ANALGESIC"));
        panadol.setQuantity(15);
        panadol.setType(Type.valueOf("CAPSULE"));
        panadol.setManufactureOn(LocalDate.now());
        panadol.setExpiry(panadol.getManufactureOn().plusMonths(5));
        pharmacistServices.addDrug(panadol);
        AddDrugRequest phensic = new AddDrugRequest();
        phensic.setName("Phensic");
        phensic.setType(Type.CAPSULE);
        phensic.setCategory(Category.ANALGESIC);
        phensic.setQuantity(12);
        phensic.setManufactureOn(LocalDate.now());
        phensic.setExpiry(phensic.getManufactureOn().plusMonths(5));
        pharmacistServices.addDrug(phensic);

        BuyDrugsRequest buyDrugsRequest = new BuyDrugsRequest();
        buyDrugsRequest.setDrugName("Panadol");
        buyDrugsRequest.setQuantity(15);

        pharmacistServices.buyDrugs(buyDrugsRequest);
        pharmacistServices.buyDrugs(buyDrugsRequest);
    }
//    @Test
//    public void addMultipleDrugs_drugCountIsCorrectTest() {
//        pharmacistServices.addDrug(TestDataFactory.createDrugRequest("Panadol", ANALGESIC));
//        pharmacistServices.addDrug(TestDataFactory.createDrugRequest("Amoxicillin", ANTIBIOTIC));
//        assertEquals(2L,drugs.count());
//    }
//    @Test
//    public void addedDrug_canBeFoundByIdTest() {
//        AddDrugRequest addDrugRequest = TestDataFactory.createDrugRequest("Ibuprofen", ANALGESIC);
//        pharmacistServices.addDrug(addDrugRequest);
//        Drug found = drugs.findById(1);
//        assertNotNull(found);
//        assertEquals("Ibuprofen",found.getName());
//    }
//    @Test
//    public void addedDrug_hasCorrectExpiryDateTest() {
//        AddDrugRequest addDrugRequest = TestDataFactory.createDrugRequest("Ibuprofen", ANALGESIC);
//        LocalDate expiry = LocalDate.now().plusMonths(6);
//        addDrugRequest.setExpiry(expiry);
//        pharmacistServices.addDrug(addDrugRequest);
//        Drug drug = drugs.findById(1);
//        assertEquals(expiry, drug.getExpiry());
//    }
//    @Test
//    public void drugId_isGeneratedAutomaticallyTest() {
//        pharmacistServices.addDrug(TestDataFactory.createDrugRequest("Paracetamol", ANALGESIC));
//        pharmacistServices.addDrug(TestDataFactory.createDrugRequest("Erythromycin", ANTIBIOTIC));
//        Drug drug1 = drugs.findById(1);
//        Drug drug2 = drugs.findById(2);
//        assertEquals(1, drug1.getId());
//        assertEquals(2, drug2.getId());
    //}


}