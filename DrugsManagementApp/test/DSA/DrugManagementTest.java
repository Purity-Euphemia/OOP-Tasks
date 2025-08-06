package DSA;


import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrugManagementTest {

    @Test
    public void testAddDrug_IncreasesInventory() {
        DrugManagement manager = new DrugManagement();
        Drug drug = new Drug(1, "Paracetamol", new Date(2023, 5, 1), new Category("Antibiotic"), new Type("Capsule"));
        manager.addDrug(drug, 75);
        assertEquals(1, manager.getInventory().size());
    }

}