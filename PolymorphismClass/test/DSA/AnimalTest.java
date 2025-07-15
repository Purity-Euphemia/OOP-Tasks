package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {

    @Test
    public void testPolymorphism() {
        Animal2 animal = new Cat();
        Animal2 animal2 = new Dog();

        assertEquals("Meow", animal.makeSound());
        assertEquals("Woof!", animal2.makeSound());
    }
    @Test
    public void testAnimal() {
        Animal2 animal = new Cat();
        Animal2 animal2 = new Dog();
        assertEquals("Meow", animal.makeSound());
        assertEquals("Woof!", animal2.makeSound());
        
    }
}
