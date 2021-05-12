public class Fitbyte {

    private int age;
    private int rest;

    public Fitbyte(int age, int rest) {
        this.age = age;
        this.rest = rest;
    }

    public double targetHeartRate(double percentageOfMaximum) {
        return ((206.3 - (0.711 * this.age)) - rest) * (percentageOfMaximum) + rest;
    }
}
