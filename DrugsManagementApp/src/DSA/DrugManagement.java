package DSA;

import java.util.ArrayList;
import java.util.List;

public class DrugManagement {

    private List<DrugInventory> inventoryList;

    public DrugManagement() {
        this.inventoryList = new ArrayList<>();
    }

    
    public void addDrug(Drug drug, int quantity) {
        inventoryList.add(new DrugInventory(drug, quantity));
    }


    public DrugInventory findDrugByName(String name) {
        for (DrugInventory item : inventoryList) {
            if (item.getDrug().getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null;
    }


    public boolean updateDrugQuantity(String drugName, int newQuantity) {
        DrugInventory item = findDrugByName(drugName);
        if (item != null) {
            item.setQuantity(newQuantity);
            return true;
        }
        return false;
    }


    public boolean removeDrug(String drugName) {
        DrugInventory item = findDrugByName(drugName);
        if (item != null) {
            inventoryList.remove(item);
            return true;
        }
        return false;
    }


    public void printInventory() {
        for (DrugInventory item : inventoryList) {
            System.out.println("- " + item.getDrug().getName() +
                    " | Quantity: " + item.getQuantity() +
                    " | Expiry: " + item.getDrug().getExpiry());
        }
    }

    public List<DrugInventory> getInventory() {
        return inventoryList;
    }
}
