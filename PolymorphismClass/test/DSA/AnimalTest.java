package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class AnimalTest {

    @Test
    public void testPolymorphism() {
        Animal2 animal = new Cat();
        Animal2 animal2 = new Dog();

        assertEquals("Meow", animal.makeSound());
        assertEquals("Woof!", animal2.makeSound());
    }
    @Test
    public void testIncorrectSound() {
        Animal2 animal = new Dog();
        assertNotEquals("Meow", animal.makeSound());

    }
    @Test
    public void testCastingBackToSubClass() {
        Animal2 animal = new Dog();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            assertEquals("Woof!", dog.makeSound());

        }
    }
    @Test
    public void testAnimalArrayPolymorphism() {
        Animal2[] animals = {new Cat(), new Dog()};
        String[] expectedSounds = {"Meow", "Woof!"};

        for (int count = 0; count < animals.length; count++) {
            assertEquals(expectedSounds[count], animals[count].makeSound());

        }


    }

}
