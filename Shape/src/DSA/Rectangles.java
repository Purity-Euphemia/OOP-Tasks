package DSA;


public class Rectangles extends Shapes {
    private double length;
    private double width;

    public Rectangles(double width, double length) {
        //super();
        this.length = (length < 0) ? 0 : length;
        this.width = (width < 0) ? 0 : width;
    }
    @Override
    public double area() {
        return width * length;
    }
    @Override
    public double perimeter() {
        return 2 * (width + length);
    }

    public double getLength() {
        return length;
    }
    public double getWidth() {
        return width;
    }
}
