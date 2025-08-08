package com.pddPharmacy.data.repositories;

import com.pddPharmacy.data.models.Drug;
import java.util.ArrayList;
import java.util.List;

public class Drugs {
    private List<Drug> drugs = new ArrayList<>();

    public long count() {
        return drugs.size();
    }

    public Drug save(Drug drug) {
        drug.setId(generateId());
        drugs.add(drug);
        return drug;
    }

    private int generateId() {
        return drugs.size() + 1;
    }

    public Drug findById(int id) {
        for (Drug drug : drugs) {
            if (drug.getId() == id) {
                return drug;
            }
        }
        return null; 
    }

}
