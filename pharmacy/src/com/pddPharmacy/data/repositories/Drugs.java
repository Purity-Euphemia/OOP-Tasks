package com.pddPharmacy.data.repositories;

import com.pddPharmacy.data.models.Drug;
import java.util.ArrayList;
import java.util.List;

public class Drugs {
    private List<Drug> drugs = new ArrayList<>();

    public long count() {
        return drugs.size();
    }

    public Drug savedNew(Drug drug) {
        drug.setId(generateId());
        drugs.add(drug);
        return drug;
    }

    private int generateId() {
        return drugs.size() + 1;
    }

    public Drug save(Drug drug) {
        if (isNew(drug)) {
            savedNew(drug);
        } else {
            update(drug);
        }
        return drug;
    }

    private boolean isNew(Drug drug) {
        if (drug.getId() == 0) {
            return true;
        }
        return false;
    }

    private  void update(Drug drug) {
        deleteById(drug.getId());
        drugs.add(drug);
    }

    private  void deleteById(int id) {
        for (int count = 0; count < drugs.size(); count++) {
            if (drugs.get(count).getId() == id) {
                drugs.remove(count);
                return;
            }
        }
    }
    public Drug findById(int id) {
        for (var drug : drugs) {
            if (drug.getId() == id) {
                return drug;
            }
        }
        return null;
    }

}
