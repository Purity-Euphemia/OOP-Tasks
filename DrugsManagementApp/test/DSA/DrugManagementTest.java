package DSA;


import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

public class DrugManagementTest {

    @Test
    public void testAddDrug_IncreasesInventory() {
        DrugManagement manager = new DrugManagement();
        Drug drug = new Drug(1, "Paracetamol", new Date(2023, 5, 1), new Category("Antibiotic"), new Type("Capsule"));
        manager.addDrug(drug, 75);
        assertEquals(1, manager.getInventory().size());
    }
    @Test
    public void testAddTwoDrugs_IncreasesInventory() {
        DrugManagement manager = new DrugManagement();
        Drug drug = new Drug(1, "Paracetamol", new Date(2023, 5, 1), new Category("Antibiotic"), new Type("Capsule"));
        manager.addDrug(drug, 75);
        assertEquals(1, manager.getInventory().size());
        Drug drug2 = new Drug(2, "Iron supplement", new Date(2024, 3, 15), new Category("Anemia"), new Type("Syrup"));
        manager.addDrug(drug2, 100);
        assertEquals(2, manager.getInventory().size());
    }
    @Test
    public void testFindDrugByNameExists() {
        DrugManagement manager = new DrugManagement();
        Drug drug = new Drug(3, "Amoxicillin", new Date(2030, 4, 20), new Category("Antibiotic"), new Type("Capsule"));
        manager.addDrug(drug, 100);
        DrugInventory found = manager.findDrugByName("Amoxicillin");
        assertNotNull(found);
        assertEquals("Amoxicillin", found.getDrug().getName());
    }
    @Test
    public void testRemoveDrugSuccess() {
        DrugManagement manager = new DrugManagement();
        Drug drug = new Drug(4, "Iron Supplement", new Date(2012, 11, 31), new Category("Anemia"), new Type("Syrup"));
        manager.addDrug(drug, 50);
        boolean result = manager.removeDrug("Iron Supplement");
        assertTrue(result);
        assertNull(manager.findDrugByName("Iron Supplement"));


    }

}