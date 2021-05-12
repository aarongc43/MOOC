public class PaymentCard {
    private double balance;
    private double amount;

    // Get initial balance of card from student
    public PaymentCard(double initialBalance) {
        this.balance = initialBalance;
    }

    public String toString() {
        return "Your balance: " + this.balance;
    }

    public void eatAffordably() {
        if (this.balance - 2.6 >= 0) {
            this.balance -= 2.6;
        }
        else {
            System.out.println("Funds are too low.");
        }
    }

    public void eatHeartily() {
        if (this.balance - 4.6 >= 0) {
            this.balance -= 4.6;
        }
        else {
            System.out.println("Funds are too low.");
        }
    }

    public void addMoney(double amount) {
        this.balance += amount;

        if (amount < 0) {
            System.out.println("You cannot add negative money.");
        }
        if (this.balance > 150) {
            this.balance = 150;
            System.out.println("Funds have been added congratulations!");
        }
    }
}   
