// 'final' keyword in variables is used to make those variables immutable.
// if we want ot change them we must make a new object to represent that new amount of money

public class Money {

    private final int dollars;
    private final int cents;
    
    public Money(int dollars, int cents) {
        this.dollars = dollars;
        this.cents = cents;
    }

    public int dollars() {
        return dollars;
    }

    public int cents() {
        return cents;
    }

    public Money plus(Money addition) {
        //have to create new int vars because the initial vars are immutable
        //return the addition of old vars with the vars of addition
        int newDollars = this.dollars + addition.dollars();
        int newCents = this.cents + addition.cents();

        return new Money(newDollars, newCents);
    }

    public boolean lessThan(Money compared) {
        // return true if the money-object has a lesser value than the parameter
        double total = this.dollars + this.cents;
        double comparedTotal = compared.dollars + compared.cents;
        return total < comparedTotal;
    }

    public Money minus(Money decreaser) {
        //returns new money object worth the difference of the object whose method
        // was called and the object recieved as the parameter
        int dollars = this.dollars - decreaser.dollars;
        int cents = this.cents - decreaser.cents;

        // if cents are negative change them to positive
        if (cents < 0) {
            cents += 100;
            dollars -= 1;
        }

        if (dollars < 0) {
            return new Money(0,0);
        }

        return new Money(dollars, cents);

    }

    public String toString() {
        String zero= "";
        if (cents <= 10) {
            zero = "0";
        }

        return "$" + dollars + "." + zero + cents;
    }
}
