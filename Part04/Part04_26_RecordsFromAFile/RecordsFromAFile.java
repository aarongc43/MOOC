import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class RecordsFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the name of the file
        System.out.println("What file would you like to look up?(data.txt)");
        String file = scanner.nextLine();

        // ArrayList for data.txt
        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                list.add(line);

                String[] pieces = line.split(",");

                if (Integer.valueOf(pieces[1]) == 1) {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " year");
                } else {
                    System.out.println(pieces[0] + ", age: " + pieces[1] + " year");
                }
            }

        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
