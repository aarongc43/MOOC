import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;

    public TextUI (Scanner scanner, SimpleDictionary dictionary) {
        this.scanner = scanner;
        this.dictionary= dictionary;
    }

    public void start() {
        while(true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();

            if (command.equals("end")) {
                System.out.println("Bye, Bye");
                break;
            } else if (command.equals("add")) {
                add();
            } else if (command.equals("search")) {
                search();
            }
            else {
                System.out.println("Unknown command");
                System.out.println("List of commands:\n add\n search\n end\n");
            }
        }
    }

    public void add() {
        System.out.println("Adding a translation...");
        System.out.println("Word: ");
        String word = scanner.nextLine();
        System.out.println("Translation: ");
        String translation = scanner.nextLine();
        dictionary.add(word, translation);
    }

    public void search() {
        System.out.println("To be translated: ");
        String toBeTranslated = scanner.nextLine();

        if (dictionary.translate(toBeTranslated) == null) {
            System.out.println("Word " + toBeTranslated + " was not found.");
        } else { 
            System.out.println("Translation: " + dictionary.translate(toBeTranslated));
        }
    }
}
