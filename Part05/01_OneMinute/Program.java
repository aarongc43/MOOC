import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Timer2 timer = new Timer2();

        while (true) {
            System.out.println(timer);
            timer.advance();

            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
}
