package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {
    @Test
    public void testValidStudentCreation() {
        Student student = new Student("Ada", 20, 90.5);
        assertEquals("Ada", student.getName());
        assertEquals(20, student.setAge());
        assertEquals(90.5, student.getGrade());
    }
    @Test
    public void testInvalidGradeOnCreation() {
        Student student = new Student("Chidi", 22, 110);
        assertNotEquals("110", student.getGrade());

    }
}
