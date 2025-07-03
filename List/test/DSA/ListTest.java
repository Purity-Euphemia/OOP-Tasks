package DSA;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ListTest {
    private int listSize;


    @BeforeEach
    public void setUp() { ListMethod value = new ListMethod(10); }

    @Test
    public void listEmptyTest(){
        ListMethod value = new ListMethod(10);
        assertTrue(value.isEmpty());
    }
    @Test
    public void addOneElement_emptyListTest(){
        ListMethod value = new ListMethod(10);
        assertTrue(value.isEmpty());
        value.add(5);
        assertFalse(value.isEmpty());
    }
    @Test
    public void addOneElement_removeOne_emptyListTest(){
        ListMethod value = new ListMethod(10);
        assertTrue(value.isEmpty());

        value.add(5);
        assertFalse(value.isEmpty());
        value.remove(5);
        assertTrue(value.isEmpty());
    }

    @Test
    public void addTwoElements_removeTwo_emptyListTest(){
        ListMethod value = new ListMethod(10);
        assertTrue(value.isEmpty());

        value.add(5);
        value.add(5);
        assertFalse(value.isEmpty());
        value.remove(5);
        value.remove(5);
        assertTrue(value.isEmpty());
    }

    @Test
    public void removeElementOne_listIsNotEmptyTest(){
        ListMethod value = new ListMethod(10);
        value.add(5);
        value.add(5);

        value.remove(1);
        assertFalse(value.isEmpty());
    }

    @Test
    public void addElement_removeShouldReturnTheElementTest(){
        ListMethod value = new ListMethod(10);
        value.add(5);
        assertEquals(5, value.remove(5));
    }

    @Test
    public void addTwoElement_andShouldReturnOneOfTheElementTest(){
        ListMethod value = new ListMethod(10);
        value.add(5);
        value.add(5);
        assertEquals(5, value.remove(5));
    }

    @Test
    public void shouldThrowUnderFlowExecption_whenEmptyListIsRemovedTest(){
        ListMethod value = new ListMethod(10);
        assertTrue(value.isEmpty());
        assertThrows(listUnderFlowException.class, ()-> value.remove(5));
    }

    @Test
    public void


}
