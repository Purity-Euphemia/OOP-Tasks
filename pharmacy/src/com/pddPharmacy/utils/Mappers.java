package com.pddPharmacy.utils;

import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.request.AddDrugRequest;
import com.pddPharmacy.dtos.response.AddDrugResponse;

public class Mappers {
    public static Drug map(AddDrugRequest addDrugRequest) {
        Drug drug = new Drug();
        drug.setName(addDrugRequest.getName());
        drug.setCategory(addDrugRequest.getCategory());
        drug.setExpiry(addDrugRequest.getExpiry());
        drug.setManufactureOn(addDrugRequest.getManufactureOn());
        drug.setQuantity(addDrugRequest.getQuantity());
        return drug;
    }

    public static AddDrugResponse map(Drug savedDrug) {
        AddDrugResponse addDrugResponse = new AddDrugResponse();
        addDrugResponse.setDrugId(savedDrug.getId());
        addDrugResponse.setDrugName(savedDrug.getName());
        return addDrugResponse;
    }

}
