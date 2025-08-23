package com.pddPharmacy.services;



import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import com.pddPharmacy.dtos.request.AddDrugRequest;
import com.pddPharmacy.dtos.request.BuyDrugsRequest;
import com.pddPharmacy.dtos.response.AddDrugResponse;
import com.pddPharmacy.dtos.response.AvailableDrugResponse;
import com.pddPharmacy.exceptions.InvalidDrugQuantityException;
import com.pddPharmacy.utils.Mappers;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

import static com.pddPharmacy.utils.Mappers.convertToResponse;
import static com.pddPharmacy.utils.Validator.Validate;

public class PharmacistServices {
   private static Drugs drugs = new Drugs();


   public static AddDrugResponse addDrug(AddDrugRequest addDrugRequest) {
       Validate(addDrugRequest);
       Drug drug = Mappers.convertToDrug(addDrugRequest);
       Drug savedDrug = drugs.save(drug);
       return convertToResponse(savedDrug);
   }
   public void buyDrugs(BuyDrugsRequest buyDrugsRequest){
       Drug drug = drugs.findByName(buyDrugsRequest.getDrugName());
       drug.setQuantity(drug.getQuantity() - buyDrugsRequest.getQuantity());
       drugs.save(drug);
   }
   public List<AvailableDrugResponse> getAvailableDrugs() {
       List<Drug> allDrugs = drugs.findAll();
       List<AvailableDrugResponse> availableDrugs = new ArrayList<>();
       for(Drug drug: allDrugs) {
           if(drug.getQuantity() > 0) {
               AvailableDrugResponse availableDrugResponse = new AvailableDrugResponse();
               availableDrugResponse.setName(drug.getName());
               availableDrugResponse.setQuantity(drug.getQuantity());
               availableDrugResponse.setIsExpired(drug.getExpiryDate().isBefore(LocalDate.now()));
               availableDrugs.add(availableDrugResponse);
           }
       }
       return availableDrugs;
   }


}
