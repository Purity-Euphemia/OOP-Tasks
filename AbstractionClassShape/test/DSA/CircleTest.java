package DSA;

import org.junit.jupiter.api.Test;


import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testConcreteCircle(){
        Circle circle = new Circle(10);
        System.out.println(circle);
    }
    @Test
    public void testAbstractionWithShapeReference(){
        Shape shape = new Circle(10);
        System.out.println(shape);
    }
    @Test
    public void testAbstractionWithShapeReference2(){
        Shape shape = new Rectangle(10, 20);
        System.out.println(shape);
    }


    @Test
    public void testAbstraction(){
        Shape circle = new Circle(2.0);
        assertEquals(Math.PI * 4, circle.area(),0.01);

    }
    @Test
    public void testAbstraction2(){
        Shape rectangle = new Rectangle(2.0, 3.0);
        assertEquals(2 * 3.0, rectangle.area(),0.01);
    }
    @Test
    public void testAbstraction3(){
        Shape circle = new Circle(2.0);
        assertEquals(2 * Math.PI * 2.0, circle.perimeter(),0.01);
    }
    @Test
    public void testAbstraction4(){
        Shape rectangle = new Rectangle(2.0, 3.0);
        assertEquals(2 * (2.0 + 3.0), rectangle.perimeter(),0.01);
    }
}
