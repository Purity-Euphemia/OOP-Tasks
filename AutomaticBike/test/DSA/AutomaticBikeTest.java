package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void testBikeCanTurnOnBike() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void testBikeCanTurnOffBike() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        bike.turnOff();
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());
    }

    @Test
    public void testBikeCanTurnOffBikeWithSpeed() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        bike.increaseSpeed();
        bike.turnOff();
        assertFalse(bike.isOn());
        assertEquals(0, bike.getSpeed());

    }

    @Test
    public void testAccelerationInGearOne() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        for (int count = 0; count < 15; count++) bike.accelerate();
        bike.accelerate();
        assertEquals(16, bike.getSpeed());
        assertEquals(1, bike.getGear());
    }

    @Test
    public void testAccelerationInGearTwo() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        for (int count = 0; count < 21; count++) bike.accelerate();
        bike.accelerate();
        assertEquals(23, bike.getSpeed());
        assertEquals(2, bike.getGear());
    }

    @Test
    public void testAccelerationInGearThree() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        for (int count = 0; count < 25; count++) bike.accelerate();
        bike.accelerate();
        //assertEquals(33, bike.getSpeed());
        assertEquals(3, bike.getGear());
    }

    @Test
    public void testAccelerationInGearFour() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        while (bike.getSpeed() <= 40) bike.accelerate();
        bike.accelerate();
        //assertEquals(44, bike.getSpeed());
        assertEquals(4, bike.getGear());

    }

    @Test
    public void testSpeedShouldNotGoBelowZero() {
        AutomaticBikeFunction bike = new AutomaticBikeFunction();
        bike.turnOn();
        bike.decelerate();
        assertEquals(0, bike.getSpeed());


    }
}