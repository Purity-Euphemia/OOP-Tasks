package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorcycleTest {

    @Test
    public void testStartEngineFromVehicle() {
        Motorcycle motorcycle = new Motorcycle();
        String result = motorcycle.startEngine();
        assertEquals("Engine is starting", result);
    }
    @Test
    public void testPopWheelieFromVehicle() {
        Motorcycle motorcycle = new Motorcycle();
        String result = motorcycle.popWheelie();
        assertEquals("Popping a wheelie!", result);
    }
    @Test
    public void testPopWheelIsSafe() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.accelerate(15);
        assertEquals("Popping a wheelie!", motorcycle.popWheelie());
    }
    @Test
    public void testStopEngineFromMotorcycle() {
        Motorcycle motorcycle = new Motorcycle();
        String result = motorcycle.stopEngine();
        assertEquals("Engine is stopping", result);
    }
    @Test
    public void testBrakeModeFromMotorcycle() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.brake();
        assertEquals("Motorcycle is braking safely", motorcycle.brake());

    }
    @Test
    public void testAccelerateAndGetSpeed() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.accelerate(30);
        assertEquals(30, motorcycle.getSpeed());
    }
    @Test
    public void testBrakeAtHighSpeed() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.accelerate(60);
        String result = motorcycle.brake();
        assertEquals("Emergency! brake! Motorcycle was going too fast!", result);
        assertEquals(0, motorcycle.getSpeed());
    }
    @Test
    public void testBrakeAtLowSpeed() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.accelerate(10);
        motorcycle.brake();
        String result = motorcycle.brake();
        assertEquals("Motorcycle is braking safely", result);
        assertEquals(0, motorcycle.getSpeed());
    }
    @Test
    public void testDecelerateAndGetSpeed() {
        Motorcycle motorcycle = new Motorcycle();
        motorcycle.accelerate(40);
        assertEquals(40, motorcycle.getSpeed());
        motorcycle.decelerate(30);
        assertEquals(10, motorcycle.getSpeed());


    }

}
