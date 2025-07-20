package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NokiaTest {

    @Test
    public void testThatNokiaIsCreated(){
        Nokia nokia = new Nokia();
        System.out.println(nokia);
        assertNotNull(nokia);
    }
    @Test
    public void testThatNokiaCanBeTurnedOn(){
        Nokia nokia = new Nokia();
        nokia.turnOn();
        assertTrue(nokia.getStatus());
    }
    @Test
    public void testThatNokiaCanBeTurnedOff(){
        Nokia nokia = new Nokia();
        nokia.turnOff();
        assertFalse(nokia.getStatus());
    }
}
