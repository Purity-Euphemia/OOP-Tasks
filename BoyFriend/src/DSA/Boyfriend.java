package DSA;

public class Boyfriend {
    private Girlfriend girlfriend;

    public Boyfriend(Girlfriend girlfriend) {
        this.girlfriend = girlfriend;
    }

    public void setGirlfriend(Girlfriend newGirlfriend) {
        this.girlfriend = newGirlfriend;
    }

    public void cook() {
        girlfriend.cook();
    }
}
