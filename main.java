import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        PaymentCard card = new PaymentCard(5);
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);

        card.eatHeartily();
        System.out.println(card);

        card.addMoney(100);
        System.out.println(card);
        card.addMoney(100);
        System.out.println(card);
        card.addMoney(-3);

    }
}
