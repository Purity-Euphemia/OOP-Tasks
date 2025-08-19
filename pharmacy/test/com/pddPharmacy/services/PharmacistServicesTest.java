package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Category;
import com.pddPharmacy.data.models.Drug;
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
        pharmacistServices = new PharmacistServices(drugs);
    }
    @Test
    public void addDrug_drugCountIsOneTest() {
        AddDrugRequest addDrugRequest= new AddDrugRequest();
        addDrugRequest.setName("Panadol");
        addDrugRequest.setCategory(ANALGESIC);
        addDrugRequest.setQuantity(5);
        addDrugRequest.setType("Capsule");
        addDrugRequest.setManufactureOn(LocalDate.now());
        addDrugRequest.setExpiry(addDrugRequest.getManufactureOn().plusMonths(5));
        pharmacistServices.addDrug(addDrugRequest);
        assertEquals(1L,drugs.count());
    }
    @Test
    public void addDrugWithZeroQuantity_throwsException() {
        AddDrugRequest Panadol = new AddDrugRequest();
        Panadol.setName("Panadol");
        Panadol.setCategory(ANALGESIC);
        Panadol.setQuantity(0);
        Panadol.setType("Capsule");
        Panadol.setManufactureOn(LocalDate.now());
        Panadol.setExpiry(Panadol.getManufactureOn().plusMonths(5));
        assertThrows(InvalidDrugQuantityException.class, () -> PharmacistServices.addDrug(Panadol));
        assertEquals(0,drugs.count());
    }
    @Test
    public void buyDrugs_quantityReducesTest() {
        AddDrugRequest Panadol = new AddDrugRequest();
        Panadol.setName("Panadol");
        Panadol.setCategory(ANALGESIC);
        Panadol.setQuantity(15);
        Panadol.setType("Capsule");
        Panadol.setManufactureOn(LocalDate.now());
        Panadol.setExpiry(Panadol.getManufactureOn().plusMonths(5));
        BuyDrugsRequest Phensic = new BuyDrugsRequest();
        Phensic.setDrugName("Panadol");
        Phensic.setCategory(ANALGESIC);
        Phensic.setQuantity(12);
        Phensic.setType("Capsule");
        Phensic.setManufactureOn(LocalDate.now());
        Phensic.setExpiry(Phensic.getManufactureOn().plusMonths(5));



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