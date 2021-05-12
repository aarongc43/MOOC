public class Statistics {

    private int count;
    private int sum;

    // adds new number to statistics
    public void addNumber(int number) {
        count++;
        sum += number;
    }

    // tells number of added numbers
    public int getCount() {
        return count;
    }

    public int sum() {
        return sum;
    }

    public double average() {
        return (double)sum / count;
    }
}
