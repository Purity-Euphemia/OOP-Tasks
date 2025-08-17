package com.pddPharmacy.services;

import com.pddPharmacy.data.models.Category;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.request.AddDrugRequest;
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
        pharmacistServices.addDrug(createRequest("Panadol", ANALGESIC));
        pharmacistServices.addDrug(createRequest("Amoxicillin", ANTIBIOTIC));
        assertEquals(2L,drugs.count());
    }

    private AddDrugRequest createRequest(String panadol, Category category) {
        AddDrugRequest addDrugRequest = new AddDrugRequest();
        addDrugRequest.setName(name);
        addDrugRequest.

    }
}