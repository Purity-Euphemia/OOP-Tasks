package DSA;

public class Employee {
    private String firstName;
    private String lastName;

    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFullName() {
        return firstName + " " + lastName;
    }
    public double earnings() {
        return 0.0;
    }
}
