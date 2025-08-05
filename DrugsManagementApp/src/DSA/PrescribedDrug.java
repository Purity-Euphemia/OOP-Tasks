package DSA;

public class PrescribedDrug {
    private Drug drug;
    private int quantity;

    public PrescribedDrug(Drug drug, int quantity) {
        this.drug = drug;
        this.quantity = quantity;
    }
    public Drug getDrug() {
        return drug;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
