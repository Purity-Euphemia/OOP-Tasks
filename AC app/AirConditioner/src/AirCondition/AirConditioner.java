package AirCondition;

public class AirConditioner {
    private boolean isOn;
    private int temperature;

    public void turnOn() {
        this.isOn = true;
    }

    public void turnOff() {
        this.isOn = false;
    }

    public boolean check(){
        return this.isOn;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature(int increase) {
        this.temperature += increase;
        if (temperature > 30) {
            temperature = 30;
        }
    }

    public void decreaseTemperature(int decrease) {
        this.temperature -= decrease;
        if (temperature < 16) {
            temperature = 16;
        }
    }



}

