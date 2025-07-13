package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class testLeapYears {

    @Test
    public void testYearDivisibleBy4IsLeapYear(){
       myLeapYears myLeapYears = new myLeapYears();
       assertTrue(myLeapYears.isLeapYear(2020));

    }
    @Test
    public void testYearNotDivisibleBy4IsNotLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertFalse(myLeapYears.isLeapYear(2019));
    }
    @Test
    public void testYearDivisibleBy100ButNotBy400IsNotLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertFalse(myLeapYears.isLeapYear(1900));
    }
    @Test
    public void testYearDivisibleBy400IsLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertTrue(myLeapYears.isLeapYear(2000));
    }
    @Test
    public void testNegativeLeapYearIsLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertTrue(myLeapYears.isLeapYear(-2020));
    }
    @Test
    public void testYearZeroYearIsLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertTrue(myLeapYears.isLeapYear(0));
    }
    @Test
    public void testYearNotDivisibleBy4Or100Or400IsNotLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertFalse(myLeapYears.isLeapYear(1901));
    }
    @Test
    public void testYearNotDivisibleBy400ButDivisibleBy100IsNotLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertFalse(myLeapYears.isLeapYear(2001));
    }
    @Test
    public void testYearDivisibleBy4Not100Or400IsLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertTrue(myLeapYears.isLeapYear(2004));
    }
    @Test
    public void testYearNotDivisibleBy4Or100Or400IsNotLeapYearAgain(){
        myLeapYears myLeapYears = new myLeapYears();
        assertFalse(myLeapYears.isLeapYear(2003));
    }
    @Test
    public void testYearDivisibleBy400IsLeapYearAgain(){
        myLeapYears myLeapYears = new myLeapYears();
        assertTrue(myLeapYears.isLeapYear(2400));
    }
    @Test
    public void testYearDivisibleBy4ButNot100IsLeapYear(){
        myLeapYears myLeapYears = new myLeapYears();
        assertTrue(myLeapYears.isLeapYear(204));
    }

}
