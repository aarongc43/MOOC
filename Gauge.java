public class Gauge {
    private int value;

    public Gauge() {
    }

    public void increase() {
        value = value + 1;
    }

    public void decrease() {
        value = value - 1;
    }

    public int value() {
        return value;
    }

    public boolean full() {
        return value >= 5;
    }

    public String toString() {
        return value + ":value:";
    }
}
