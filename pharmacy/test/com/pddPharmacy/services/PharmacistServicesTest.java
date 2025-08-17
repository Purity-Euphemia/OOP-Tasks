package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Category;
import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.request.AddDrugRequest;
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
    public void addMultipleDrugs_drugCountIsCorrectTest() {
        pharmacistServices.addDrug(TestDataFactory.createDrugRequest("Panadol", ANALGESIC));
        pharmacistServices.addDrug(TestDataFactory.createDrugRequest("Amoxicillin", ANTIBIOTIC));
        assertEquals(2L,drugs.count());
    }
    @Test
    public void addedDrug_canBeFoundByIdTest() {
        AddDrugRequest addDrugRequest = TestDataFactory.createDrugRequest("Ibuprofen", ANALGESIC);
        pharmacistServices.addDrug(addDrugRequest);
        Drug found = drugs.findById(1);
        assertNotNull(found);
        assertEquals("Ibuprofen",found.getName());
    }
    @Test
    public void addedDrug_hasCorrectExpiryDateTest() {
        AddDrugRequest addDrugRequest = TestDataFactory.createDrugRequest("Ibuprofen", ANALGESIC);
        LocalDate expiry = LocalDate.now().plusMonths(6);
        addDrugRequest.setExpiry(expiry);
        pharmacistServices.addDrug(addDrugRequest);
        Drug drug = drugs.findById(1);
        assertEquals(expiry, drug.getExpiry());
    }


}