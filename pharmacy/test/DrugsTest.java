import com.pddPharmacy.data.models.Drug;
import com.pddPharmacy.data.repositories.Drugs;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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



}
