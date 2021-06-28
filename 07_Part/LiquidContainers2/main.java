import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Containers first = new Containers();
        Containers second = new Containers();

        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: " + second);

            System.out.print("> ");

            String input = scanner.nextLine();

            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add")) {
                first.add(amount);
            }

            if (command.equals("move")) {

                if ((first.contains() - amount) < 0) {
                    second.add(first.contains());
                            first.remove(amount);
                }

                if ((first.contains() - amount >= 0)) {
                    first.remove(amount);
                    second.add(amount);
                }
            }

            if (command.equals("remove")) {
                second.remove(amount);
            }
        }
    }
}
