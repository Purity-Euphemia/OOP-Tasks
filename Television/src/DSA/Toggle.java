package DSA;

public class Toggle {
    private boolean status;

    public void isOn() {
        this.status = true;
    }
    public void isOff() {
        this.status = false;
    }
    public boolean toggle() {
        return status = !status;
    }
}
