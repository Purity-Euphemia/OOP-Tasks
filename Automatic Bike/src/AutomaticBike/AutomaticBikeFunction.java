package AutomaticBike;

public class AutomaticBikeFunction {
    private boolean isOn;
    private int acceleration;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean check(){
        return this.isOn;
    }

    public int getAcceleration() {
        return acceleration;
    }
    public void increaceAcceleration(int speed) {
        this.acceleration = speed;
    }


        }
