package com.pddPharmacy.controllers;


import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.request.AddDrugRequest;
import com.pddPharmacy.dtos.response.AddDrugResponse;
import com.pddPharmacy.services.PharmacistServices;

public class PharmacistControllers {
    private PharmacistServices pharmacistServices = new PharmacistServices();


    public AddDrugResponse recordNewDrug(AddDrugRequest addDrugRequest) {
        return  pharmacistServices.addDrug(addDrugRequest);
    }
    public String buyDrug(BuyDrugsRequest buyDrugsRequest) {
        pharmacistServices.buyDrugs(buyDrugsRequest);
        return "Purchased";
    }
    public List<AvailableDrugResponse> getAvailableDrugs(){
        return pharmacistServices.getAvailableDrugs();
    }

}

