package com.pddPharmacy.dtos.response;

public class AddDrugResponse {
    private int drugId;
    private String drugName;
    private String message;

    public int getDrugId() {
        return drugId;
    }
    public void setDrugId(int drugId) {
        this.drugId = drugId;
    }
    public String getDrugName() {
        return  drugName;
    }
    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }
    public  String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
}
