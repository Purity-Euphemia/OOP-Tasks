package DSA;
import java.util.List;

public class Prescription {
    private int id;
    private String doctor;
    private List<PrescribedDrug> prescribedDrugs;

    public Prescription(int id, String doctor, List<PrescribedDrug> prescribedDrugs) {
        this.id = id;
        this.doctor = doctor;
        this.prescribedDrugs = prescribedDrugs;
    }

    public int getid() {
        return id;
    }
    public String getDoctor() {
        return doctor;
    }
    public List<PrescribedDrug> prescribedDrugs() {
        return prescribedDrugs;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }
    public void setPrescribedDrugs(List<PrescribedDrug> prescribedDrugs) {
        this.prescribedDrugs = prescribedDrugs;
    }
}
