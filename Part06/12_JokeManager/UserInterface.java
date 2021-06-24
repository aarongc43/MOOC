import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;

    public UserInterface(JokeManager manager, Scanner scanner) {
        this.manager = manager;
        this.scanner = scanner;
    }

    public void start() {
            System.out.println("Commands:");
            System.out.println("1 - add a joke\n2 - draw a joke\n3 - print jokes\nX - Stop");

        while(true) {
            System.out.print("Command: ");

            String command = scanner.nextLine();

            if (command.equals("X")) {
                break;
            }

            processCommand(command);
        }
    }

    public void processCommand(String command) {
        if (command.equals("1")) {
            addJoke();
        } else if (command.equals("2")) {
            drawJokes();
        } else {
            printJokes();
        }
    }

    public void addJoke() {
        System.out.println("Add your joke: ");
        String joke = scanner.nextLine();
        manager.addJoke(joke);
    }

    public void drawJokes() {
        System.out.println("Drawing jokes:");
        System.out.println(manager.drawJokes());
    }

    public void printJokes() {
        System.out.println("Printing jokes:");
        manager.printJokes();
    }
    
}
