package toggle;

import DSA.Toggle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToggleTest {

    @Test
    public void ToggleTest(){
        Toggle toggle = new Toggle();
        toggle.toggle();
        assertFalse(toggle.toggle());
        assertTrue(toggle.toggle());
    }
    @Test
    public void ToggleTest2(){
        Toggle toggle = new Toggle();
        toggle.toggle();
        assertFalse(toggle.toggle());
        assertTrue(toggle.toggle());
        assertFalse(toggle.toggle());
    }
}
