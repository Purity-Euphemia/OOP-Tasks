package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiariesTest {

    @Test
    public void testDiariesIsEmpty() {
        Diaries diaries = new Diaries();
        diaries.getDiary();
        assertEquals(0, diaries.getDiary().size());
    }
    @Test
    public void testAddOneElementToDiaries_EmptyDiary() {
        Diaries diaries = new Diaries();
        diaries.getDiary();
        diaries.add("Chioma", "Obi");
        assertEquals(1, diaries.getDiary().size());
    }






}
