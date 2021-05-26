// Part 1: ask user for items and add items to a list 
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Archive> magazines  = new ArrayList<>();

        System.out.println("Enter the items to keep in the archive.");
        
        while (true) {
            System.out.println("Issue Number: ");
            String issueNumber = scan.nextLine(); 
            
            if (issueNumber.isEmpty()) {
                break;
            }

            System.out.println("Name: ");
            String name = scan.nextLine();

            if (name.isEmpty()) {
                break;
            }

            // Create item object
            Archive item  = new Archive(issueNumber, name);

            if (magazines.contains(item)) {
                continue;
            } else {
                magazines.add(item);
            }
            
        }

        System.out.println("===Items===");
        for (Archive mags : magazines) {
            System.out.println(mags);
        }
    }
}
