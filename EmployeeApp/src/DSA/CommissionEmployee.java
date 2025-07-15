package DSA;

public class CommissionEmployee extends Employee {
    private double sales;
    private double rate;

    public CommissionEmployee(String firstName, String lastName, double sales, double rate) {
        super(firstName, lastName);
        this.sales = sales;
        this.rate = rate;
    }
    @Override
    public double earnings() {
        return sales * rate;
    }

}
