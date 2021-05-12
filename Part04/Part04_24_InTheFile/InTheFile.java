import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Paths;

public class InTheFile {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        //ask for a file
        System.out.println("What file would you like to search?");
        String file = Scanner.nextLine();

        // Add each line of the file to an array
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Enter the names you would like to search for.\n (Empty entry will end program)");
        // Check array for name
        while(true) {
            String name = Scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
           
            if (list.contains(name)) {
                System.out.println("Name found.");
            } else {
                System.out.println("Not found.");
            }
        }
    }
}
