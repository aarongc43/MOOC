public class Counter {
    
    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public int getValue() {
        return this.startValue;
    }

    public Counter() {
        this(0);
    }

    public void increase() {
        this.startValue++;
    }

    public void increase(int increaseBy) {
        if (increaseBy < 0) {

        }
        else {
            this.startValue += increaseBy;
        }
    }

    public void decrease() {
        this.startValue--;
    }
}
