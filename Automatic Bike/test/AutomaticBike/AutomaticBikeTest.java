package AutomaticBike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AutomaticBikeTest {

    @Test
    public void AutomaticBikeTestToTurnOn() {
        AutomaticBikeFunction automaticBikeFunction = new AutomaticBikeFunction();
        automaticBikeFunction.turnOn();
        assertTrue(automaticBikeFunction.check());
    }

    @Test
    public void AutomaticBikeTestToTurnOff() {
        AutomaticBikeFunction automaticBikeFunction = new AutomaticBikeFunction();
        automaticBikeFunction.turnOn();
        automaticBikeFunction.turnOff();
        assertFalse(automaticBikeFunction.check());
    }

    @Test
    public void AutomaticTestToAccelerate() {
        AutomaticBikeFunction automaticBikeFunction = new AutomaticBikeFunction();
        automaticBikeFunction.turnOn();
        automaticBikeFunction.increaceAcceleration(40);
        assertEquals(40, automaticBikeFunction.getAcceleration());
    }


}
