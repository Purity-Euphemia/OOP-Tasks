package DSA;

public abstract class Shape {
    public abstract double area();
    public abstract double perimeter();
    public abstract String getName();

    @Override
    public String toString() {
        return getName() + "with area: " + area() + " and perimeter: " + perimeter();
    }


}
