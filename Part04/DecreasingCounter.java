public class DecreasingCounter {
    private int value;  // a variable that remembers the value of the counter

    public DecreasingCounter (int initialValue) {
        value = initialValue;
    }

    public void printValue() {
        System.out.println("value: " + value);
    }

    public void decrement() {
        if (value > 0) {
            value = value - 1;
        }
    }

    public void reset() {
        value = 0; 
    }
}
