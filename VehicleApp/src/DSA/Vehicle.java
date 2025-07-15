package DSA;

public class Vehicle {
    int speed = 0;

    public String startEngine() {
        return "Engine is starting";
    }
    public String stopEngine() {
        return "Engine is stopping";
    }
    public void accelerate(int amount) {
        speed+= amount;
    }
    public void decelerate(int amount) {
        speed = Math.max(speed - amount, 0);
    }

    public int getSpeed() {
        return speed;
    }
    public String brake() {
       speed = 0;
       return "Brake is starting";
    }
}
