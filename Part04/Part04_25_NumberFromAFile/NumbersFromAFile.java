import java.util.Scanner;
import java.util.ArrayList;
import java.nio.file.Paths;

public class NumbersFromAFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // Get a file name
        System.out.println("What file would you like to search?\n-numbers-1.txt\n-numbers-2.txt");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerNum = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperNum = Integer.valueOf(scanner.nextLine());

        int counter = 0;

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                if (reader == "") {
                    System.out.println("Empty line");
                    continue;
                }
                list.add(Integer.valueOf(reader.nextLine()));
            }

            // Check if number within bounds
            for (Integer i : list) {
                if (i >= lowerNum && i <= upperNum) {
                // Add to counter for each valid number
                    counter++;
                }
            }

        System.out.println("Numbers: " + counter);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
