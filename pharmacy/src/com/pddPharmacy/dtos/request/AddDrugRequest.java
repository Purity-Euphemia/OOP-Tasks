package com.pddPharmacy.dtos.request;

import com.pddPharmacy.data.models.Category;

import java.time.LocalDate;

public class AddDrugRequest {
    private String name;
    private String type;
    private Category category;
    private LocalDate expiry;
    private int quantity;
    private LocalDate manufactureOn;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public LocalDate getExpiry() {
        return expiry;
    }
    public void setExpiry(LocalDate expiry) {
        this.expiry = expiry;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public LocalDate getManufactureOn() {
        return manufactureOn;
    }
    public void setManufactureOn(LocalDate manufactureOn) {
        this.manufactureOn = manufactureOn;
    }

}
