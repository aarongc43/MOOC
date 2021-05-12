import java.util.Scanner;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        //Get string from user to ask user for the file to print
        System.out.println("What file would you like to look at?");
        String userFile = Scanner.nextLine();

        //Scanner for reading the file
        try (Scanner scanner = new Scanner(Paths.get(userFile))) {
            
            //read file until all lines have been read
            while (scanner.hasNextLine()) {
                //read one line only
                String row = scanner.nextLine();
                //print line
                System.out.println(row);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
