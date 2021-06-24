import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ToDoList list;

    public UserInterface(Scanner scanner, ToDoList list) {
        this.scanner = scanner;
        this.list = list;
    }

    public void start() {

        System.out.println("Start adding to your Todo List");

        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                System.out.println("Bye Bye");
                break;
            }

            if (command.equals("add")) {
                add();
            } else if (command.equals("list")) {
                list();
            } else if (command.equals("remove")) {
                remove();
            }
        }
    }

    public void add() {
        System.out.println("To add: ");
        String todo = scanner.nextLine();

        list.add(todo);
    }

    public void list() {
        list.print();
    }

    public void remove() {
        System.out.println();
        list.print();

        System.out.println("Which one do you want to remove?");
        String remove = scanner.nextLine();

        list.remove(Integer.valueOf(remove));
    }

}
