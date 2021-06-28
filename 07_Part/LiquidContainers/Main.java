import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int first = 0;
        int second = 0;

        System.out.println("Commands: ");

        System.out.println("First: " + first + "/100");
        System.out.println("Second: " + second + "/100");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String [] parts = input.split(" ");
            String command = parts[0];

            // add
            if (command.equals("add")) {
                int amount = Integer.valueOf(parts[1]); 

                if (amount > 0) {
                    first += amount;
                }

                if (first > 100) {
                    first = 100;
                }
                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");

            }

            // move
            if (command.equals("move")) {
                int amount = Integer.valueOf(parts[1]);

                if (amount > 0) {
                    if (amount > 0 && amount < 100) {
                        first -= amount;
                        second += amount;
                    }

                    System.out.println("First: " + first + "/100");
                    System.out.println("Second: " + second + "/100");

                }
            }
            // remove 
            if (command.equals("remove")) {
                int amount = Integer.valueOf(parts[1]);

                if (amount > 0) {
                    second -= amount;
                }

                if (second < 0) {
                    second = 0;
                }

                System.out.println("First: " + first + "/100");
                System.out.println("Second: " + second + "/100");
            }
        }
    }
}
