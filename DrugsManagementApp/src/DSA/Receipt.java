package DSA;

import java.util.Date;

public class Receipt {
    private int id;
    private Date date;
    private Prescription prescription;

    public Receipt(int id, Date date, Prescription prescription) {
        this.id = id;
        this.date = date;
        this.prescription = prescription;
    }
    public int getId() {
        return id;
    }
    public Date getDate() {
        return date;
    }
    public Prescription getPrescription() {
        return prescription;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
