package com.pddPharmacy.controllers;


import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.request.AddDrugRequest;
import com.pddPharmacy.dtos.response.AddDrugResponse;
import com.pddPharmacy.services.PharmacistServices;

public class PharmacistControllers {
    private PharmacistServices pharmacistServices;
    private Drugs drugs;

    public AddDrugResponse recordNewDrug(AddDrugRequest addDrugRequest) {
        return  pharmacistServices.addDrug(addDrugRequest);
    }


}

