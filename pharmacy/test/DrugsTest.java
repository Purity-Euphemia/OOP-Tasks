import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DrugsTest {
    private Drugs drugs;

    @BeforeEach
    void setup() {
        drugs = new Drugs();
    }
    @Test
    public void addDrugs_countIsOne() {
        assertEquals(0,drugs.count());
        Drug panadol = new Drug();
        drugs.save(panadol);
        assertEquals(1,drugs.count());
    }
    @Test
    public void addDrugs_findDrugsByIdReturnsDrugTest() {
        Drug panadol = new Drug();
        Drug savedDrug = drugs.save(panadol);
        Drug foundDrug = drugs.findById(savedDrug.getId());
        assertEquals(savedDrug, foundDrug);
    }

    @Test
    public void add2Drug_findDrugsByIdReturnsDrugTest(){
        Drug panadol = new Drug();
        Drug alabuku = new Drug();
        Drug savedPanadol = drugs.save(panadol);
        Drug savedAlabuku = drugs.save(alabuku);
        Drug foundPanadol = drugs.findById(savedPanadol.getId());
        Drug foundAlabuku = drugs.findById(savedAlabuku.getId());
        assertEquals(savedPanadol, foundPanadol);
        assertEquals(savedAlabuku, foundAlabuku);
    }

    @Test
    public void addSavedDrug_countIsOneTest() {
        Drug panadol = new Drug();
        Drug savedPanadol = drugs.save(panadol);
        savedPanadol.setName("Panadol");
        drugs.save(savedPanadol);
        assertEquals(1,drugs.count());
        assertEquals("Panadol",drugs.findById(savedPanadol.getId()).getName());
    }

    @Test
    public  void saveDrug_assignsIdAutomatically() {
        Drug drug = new Drug();
        Drug saved = drugs.save(drug);
        assertTrue(saved.getId() > 0);
    }

    @Test
    public void saveDrugWithName_nameIsStoredCorrectly() {
       Drug drug = new Drug();
       drug.setName("Ibuprofen");
       Drug saved = drugs.save(drug);
       assertEquals("Ibuprofen",drugs.findById(saved.getId()).getName());
    }

    @Test
    public void updateDrug_updateNameCorrectly() {
        Drug drug = new Drug();
        Drug saved = drugs.save(drug);
        saved.setName("Cough Syrup");
        drugs.save(saved);
        Drug found = drugs.findById(saved.getId());
        assertEquals("Cough Syrup",found.getName());
    }

    @Test
    public void findById_returnsNullWhereNotFound() {
        assertNull(drugs.findById(1000));
    }

    @Test
    public void saveMultipleDrugs_haveUniqueIds() {
        Drug d1 = drugs.save(new Drug());
        Drug d2 = drugs.save(new Drug());
        Drug d3 = drugs.save(new Drug());
        assertNotEquals(d1.getId(), d2.getId());
        assertNotEquals(d2.getId(), d3.getId());
    }

    @Test
    public void saveSameDrugTwice_doesNotDuplicate() {
        Drug drug = drugs.save(new Drug());
        assertEquals(1,drugs.count());
        drugs.save(drug);
        assertEquals(1,drugs.count());
    }

    @Test
    public void saveThreeDrugs_countIsThree() {
        drugs.save(new Drug());
        drugs.save(new Drug());
        drugs.save(new Drug());
        assertEquals(3,drugs.count());
    }

    @Test
    public void findById_returnsCorrectDrugAfterMultipleSaves() {
        Drug d1 = drugs.save(new Drug());
        Drug d2 = drugs.save(new Drug());
        Drug found = drugs.findById(d2.getId());
        assertEquals(d2,found);
    }

    @Test
    public void drugCanBeUpdateMultipleTimes() {
        Drug drug = drugs.save(new Drug());
        drug.setName("First Name");
        drugs.save(drug);
        drug.setName("Second Name");
        drugs.save(drug);
        assertEquals("Second Name", drugs.findById(drug.getId()).getName());
    }

    @Test
    public void saveDrug_withCustomId_updatesCorrectly() {
        Drug drug = new Drug();
        drug.setId(5);
        drug.setName("Custom Drug");
        drugs.save(drug);
        Drug found = drugs.findById(5);
        assertEquals("Custom Drug", found.getName());
    }

    @Test
    public void drugsWithSameId_areConsideredSameDrug() {
        Drug drug1 = new Drug();
        Drug saved1 = drugs.save(drug1);
        Drug drug2 = new Drug();
        drug2.setId(saved1.getId());
        drug2.setName("Replaced");
        drugs.save(drug2);
        assertEquals(1, drugs.count());
        assertEquals("Replaced", drugs.findById(saved1.getId()).getName());
    }

    @Test
    public void updatedDrug_hasSameId() {
        Drug drug = new Drug();
        Drug saved = drugs.save(drug);
        int idBefore = saved.getId();
        saved.setName("Test");
        Drug updated = drugs.save(saved);
        assertEquals(idBefore, updated.getId());
    }

    @Test
    public void multipleUpdates_doNotIncreaseCount() {
        Drug drug = drugs.save(new Drug());
        assertEquals(1, drugs.count());
        for (int count = 0; count < 5; count++) {
            drug.setName("Update " + count);
            drugs.save(drug);
        }
        assertEquals(1, drugs.count());
    }

    @Test
    public void countIncreasesOnlyOnNewDrugs() {
        Drug d1 = drugs.save(new Drug());
        Drug d2 = drugs.save(new Drug());
        Drug d3 = drugs.save(d1); // update
        assertEquals(2, drugs.count());
    }

    @Test
    public void findById_returnsExactObjectReference() {
        Drug d1 = new Drug();
        Drug saved = drugs.save(d1);
        Drug found = drugs.findById(saved.getId());
        assertSame(saved, found);
    }

    @Test
    public void saveDrugWithoutSettingFields_doesNotBreak() {
        Drug drug = new Drug();
        drugs.save(drug);
        assertNotNull(drugs.findById(drug.getId()));
    }
    
}
