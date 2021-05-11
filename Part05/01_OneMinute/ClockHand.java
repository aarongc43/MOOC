// Describe a clock hand
// Contains information on its value
// upper limit (the point at which the value of the hand return to zero)
// provides methods for advancing the hand
// Viewing its value
// Printing the value in string form

public class ClockHand {
    private int value;
    private int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void advance() {
        this.value = this.value + 1;

        //clock changes back to 0 once it has reached the limit
        if (this.value >= this.limit) {
            this.value = 0;
        }
    }

    public int value() {
        return this.value;
    }

    public String toString() {
        if (this.value < 10) {
            return "0" + this.value;
        }
         return "" + this.value;
    }
}
