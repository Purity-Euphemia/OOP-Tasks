package com.pddPharmacy.testutils;

import com.pddPharmacy.data.models.Category;
import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.models.Type;
import com.pddPharmacy.dtos.request.AddDrugRequest;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TestDataFactory {
    public static AddDrugRequest createDrugRequest(String name, Category category) {
        AddDrugRequest addDrugRequest = new AddDrugRequest();
        addDrugRequest.setName(name);
        addDrugRequest.setCategory(category);
        addDrugRequest.setQuantity(10);
        addDrugRequest.setType("Tablet");
        addDrugRequest.setManufactureOn(LocalDate.now());
        addDrugRequest.setExpiry(LocalDate.now().plusMonths(6));
        return addDrugRequest;
    }
    public static Drug createDrug(int id, String name, Category category, int quantity) {
        Drug drug = new Drug();
        drug.setId(id);
        drug.setName(name);
        drug.setCategory(category);
        drug.setQuantity(quantity);
        drug.setType(Type.TABLET);
        drug.setManufactureOn(LocalDate.now().minusMonths(2));
        drug.setExpiry(LocalDate.now().plusMonths(10));
        drug.setDateAdded(LocalDateTime.now());
        return drug;
    }
}
