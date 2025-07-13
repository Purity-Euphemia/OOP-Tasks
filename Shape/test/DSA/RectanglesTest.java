package DSA;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectanglesTest {

    @Test
    public void TestAreaOfRectangleLength5Width4_shouldReturn20(){
        Rectangles rectangles = new Rectangles(4,5);
        assertEquals(20, rectangles.area());
    }
    @Test
    public void TestPerimeterOfRectangleLength5Width4_shouldReturn18(){
        Rectangles rectangles = new Rectangles(4,5);
        assertEquals(18, rectangles.perimeter());
    }
    @Test
    public void testRectangleLengthNegative(){
        Rectangles rectangles = new Rectangles(-4,5);
        assertEquals(0, rectangles.area());
    }
    @Test
    public void testRectangleWidthNegative(){
        Rectangles rectangles = new Rectangles(4,-5);
        assertEquals(0, rectangles.area());
    }
    @Test
    public void testRectangleLengthAndWidthNegative(){
        Rectangles rectangles = new Rectangles(-4,-5);
        assertEquals(0, rectangles.area());
    }
    @Test
    public void testRectangleLengthAndWidthZero(){
        Rectangles rectangles = new Rectangles(0,0);
        assertEquals(0, rectangles.area());
    }
    @Test
    public void testRectangleLengthAndWidthOne(){
        Rectangles rectangles = new Rectangles(1,1);
        assertEquals(1, rectangles.area());
    }
    @Test
    public void testRectangleLengthAndWidthTwo(){
        Rectangles rectangles = new Rectangles(2,2);
        assertEquals(4, rectangles.area());
    }
    @Test
    public void testGetRectangleLength(){
        Rectangles rectangles = new Rectangles(4,5);
        assertEquals(5, rectangles.getLength());
    }
    @Test
    public void testGetRectangleWidth(){
        Rectangles rectangles = new Rectangles(4,5);
        assertEquals(4, rectangles.getWidth());
    }
    @Test
    public void testPerimeterOfRectangleLengthZeroWidth5(){
        Rectangles rectangles = new Rectangles(0,5);
        assertEquals(10, rectangles.perimeter());
    }
    @Test
    public void testAreaOfRectangleLengthZeroWidth5(){
        Rectangles rectangles = new Rectangles(0,5);
        assertEquals(0, rectangles.area());


    }
}
