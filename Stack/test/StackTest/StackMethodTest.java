package StackTest;

import MyStack.StackMethods;
import MyStack.StackUnderFlowException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StackMethodTest {
    private String stack;


    @BeforeEach
    public void startWithThis() {
        StackMethods strings = new StackMethods(4);
    }

    @Test
    public void newStack_isEmptyTest() {
        StackMethods strings = new StackMethods(4);
        assertTrue(strings.isEmpty());
    }
    @Test
    public void pushNewStackElement_stackIsNotEmptyTest() {
        StackMethods strings = new StackMethods(4);
        assertTrue(strings.isEmpty());
        strings.push("G - String");
        assertFalse(strings.isEmpty());
    }
    @Test
    public void pushOne_popOne_stackIsEmptyTest() {
        StackMethods strings = new StackMethods(4);
        assertTrue(strings.isEmpty());

        strings.push("G_String");
        assertFalse(strings.isEmpty());
        strings.pop();
        assertTrue(strings.isEmpty());
    }

    @Test
    public void pushTwise_popTwo_stackIsEmptyTest() {
        StackMethods strings = new StackMethods(4);
        assertTrue(strings.isEmpty());
        strings.push("G - String");
        strings.push("A - String");
        assertFalse(strings.isEmpty());
        strings.pop();
        assertFalse(strings.isEmpty());
    }

    @Test
    public void pushX_popShouldReturnXTest() {
        StackMethods strings = new StackMethods(4);
        strings.push("G - String");
        assertEquals("G - String",strings.pop());
    }

    @Test
    public void pushXAndY_popShouldReturnYTest() {
        StackMethods strings = new StackMethods(4);
        strings.push("D - String");
        strings.push("G - String");
        assertEquals("G - String",strings.pop());
    }

    @Test
    public void shouldThrowUnderFlowExecption_whenEmptyStackIsPoppedTest() {
        StackMethods strings = new StackMethods(4);
        assertTrue(strings.isEmpty());
        assertThrows(StackUnderFlowException.class, ()-> strings.pop());
    }

    @Test
    public void pushXYZ_popShoutReturnZYXTest() {
        StackMethods strings = new StackMethods(4);
        strings.push("G - String");
        strings.push("A - String");
        strings.push("D - String");
        assertEquals("D - String",strings.pop());
        assertEquals("A - String",strings.pop());
        assertEquals("G - String",strings.pop());
    }


}
