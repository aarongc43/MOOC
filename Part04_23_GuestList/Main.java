import java.util.Scanner;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        // Ask for a file to be searched
        System.out.println("Enter the file to check in a guest");
        System.out.println("Files are 'names.txt' and 'other-names.txt'");
        String userFile = Scanner.nextLine();

        // add each line of the .txt doc to an array
        try (Scanner scanner = new Scanner(Paths.get(userFile))) {
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
                }
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        
        // Check array for guests
        System.out.println("Enter guest to be checked in.");
        while(true) {
            String name = Scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("Guest checked in.");
            } else {
                System.out.println("The name is not found.");
            }
        }
        
        System.out.println("All guests are checked in.");
    }
}
