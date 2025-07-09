package DSA;

public class AutomaticBikeFunction {
    private boolean isOn;
    private int speed;

    public AutomaticBikeFunction() {
        this.isOn = false;
        this.speed = 0;
    }
    public void turnOn() {
        isOn = true;
    }
    public  void turnOff() {
        isOn = false;
        speed = 0;
    }
    public boolean isOn() {
        return isOn;
    }
    public int getSpeed() {
        return speed;
    }

    public void increaseSpeed() {
        if (isOn) {
            speed += 5;
        } else {
            speed = 0;
        }
    }
    public int getGear() {
            if (speed <= 20) return 1;
            if (speed <= 30) return 2;
            if (speed <= 40) return 3;
            return 4;
    }
    public void accelerate() {
        if (!isOn) return;

        int gear = getGear();
        switch (gear) {
            case 1 -> speed = speed += 1;
            case 2 -> speed = speed += 2;
            case 3 -> speed = speed += 3;
            case 4 -> speed = speed += 4;
        }
    }


    public void decelerate() {
        if (!isOn) return;

        int gear = getGear();
        switch (gear) {
            case 1 -> speed = speed -= 1;
            case 2 -> speed = speed -= 2;
            case 3 -> speed = speed -= 3;
            case 4 -> speed = speed -= 4;
        }
        if (speed > 0) speed = 0;
    }
}

