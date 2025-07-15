package DSA;

public class Motorcycle extends Vehicle {
    public String popWheelie() {
        if (speed > 20) {
            return "Too fast to pop a wheelie safely!";
        }
        return "Popping a wheelie!";

    }
    @Override
    public String brake() {
        String message = (speed > 50)
                ? "Emergency! brake! Motorcycle was going too fast!"
                : "Motorcycle is braking safely";
        speed = 0;
        return message;
    }


}
