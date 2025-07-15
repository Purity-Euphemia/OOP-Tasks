package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    @Test
    public void testEmployeeFullName() {
        Employee employee = new Employee("Chioma", "Obi");
        assertEquals("Chioma Obi", employee.getFullName());
    }
    @Test
    public void testEmployeeEarningsDefault() {
        Employee employee = new Employee("Chioma", "Obi");
        assertEquals(0.0, employee.earnings());
    }
    @Test
    public void testCommissionEmployeeEarning() {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Chioma","Obi",5000, 0.1);
        assertEquals(500.0, commissionEmployee.earnings());
    }
    @Test
    public void testCommissionEmployeeEarningsCorrect() {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Chioma","Obi",5000, 0.10);
        assertEquals(500.0, commissionEmployee.earnings());
    }
    @Test
    public void testCommissionEmployeeEarningsWrong() {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Chioma","Obi",0, 0.1);
        assertEquals(0.0, commissionEmployee.earnings());
    }
    @Test
    public void testCommissionEmployeeEarningsZeroRate() {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Chioma","Obi",5000, 0.0);
        assertEquals(0.0, commissionEmployee.earnings());
    }
}
