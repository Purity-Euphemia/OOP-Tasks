package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class StudentTest {
    @Test
    public void testValidStudentCreation() {
        Student student = new Student("Ada", 20, 90.5);
        assertEquals("Ada", student.getName());
        assertEquals(20, student.getAge());
        assertEquals(90.5, student.getGrade());
    }
    @Test
    public void testInvalidGradeOnCreation() {
        Student student = new Student("Chidi", 22, 110);
        assertNotEquals("110", student.getGrade());
    }
    @Test
    public void testInvalidAgeOnCreation() {
        Student student = new Student("Chidi", -11, 90.5);
        assertNotEquals(-11, student.getAge());
    }
    @Test
    public void testInvalidNameOnSet() {
        Student student = new Student("Jane", 22, 90.5);
        student.setName("");
        assertNotEquals("", student.getName());
    }
    @Test
    public void testInvalidSetters() {
        Student student = new Student("Jane", 22, 90.5);
        student.setAge(29);
        student.setGrade(70.5);
        student.setName("John");

        assertEquals(29, student.getAge());
        assertEquals(70.5, student.getGrade());
        assertEquals("John", student.getName());

    }
    @Test
    public void testInvalidAgeOnSet() {
        Student student = new Student("Jane", 22, 90.5);
        student.setAge(-11);
        assertEquals(22, student.getAge());
    }
    @Test
    public void testInvalidGradeOnSet() {
        Student student = new Student("Jane", 22, 90.5);
        student.setGrade(110);
        assertEquals(90.5, student.getGrade());
    }
}
