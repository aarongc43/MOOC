import java.util.Scanner;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        ArrayList<Item> items = new ArrayList<>();

        //Read names from user
        while (true) {
            System.out.println("Enter names, empty will stop.");
            String item = Scanner.nextLine();
            if (item.isEmpty()) {
                break;
            }

            // Add to the list a new person
            // whose name is the previous user input
            items.add(new Item(item));
        }

        // Print number of entered persons, and their individual info
        System.out.println();
        System.out.println("Items in total: " + items.size());
        System.out.println("Persons: ");

        for (Item item: items) {
            System.out.println(item);
        }
    }
}
