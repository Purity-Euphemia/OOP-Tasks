package AirCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {

    @Test
    public void testAirConditionerToTurnOn() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        assertTrue(airConditioner.check());
    }

    @Test
    public void testAirConditionerToTurnOff() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.turnOff();
        assertFalse(airConditioner.check());
    }

    @Test
    public void testIncreaseTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.increaseTemperature(30);
        airConditioner.increaseTemperature(10);
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testDecreaseTemperature() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.increaseTemperature(30);
        airConditioner.decreaseTemperature(10);
        assertEquals(20, airConditioner.getTemperature());
    }

    @Test
    public void testIncreaseTemperatureNotToPass30() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.increaseTemperature(40);
        assertEquals(30, airConditioner.getTemperature());
    }

    @Test
    public void testDecreaseTemperatureNotToPass16() {
        AirConditioner airConditioner = new AirConditioner();
        airConditioner.turnOn();
        airConditioner.decreaseTemperature(10);
        assertEquals(16, airConditioner.getTemperature());
    }




}
