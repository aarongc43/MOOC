import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        // Read book info from user: Title, Pages, Publication Year
        // User then asked to print what is to be printed after done with books
        // "everything", "name": Book titles, "
        Scanner Scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while(true) {
            System.out.println("What is the name of your favorite book?");

            String name = Scanner.nextLine();

            if (name.isEmpty()) {
                break;
            }

            System.out.println("Pages: ");
            int pages = Integer.valueOf(Scanner.nextLine());

            System.out.println("Year Published: ");
            int year = Integer.valueOf(Scanner.nextLine());

            books.add(new Book(name, pages, year));
            
        }

        System.out.println("What information about your books would you like to be printed?");
        String info = Scanner.nextLine();

        for (Book book: books) {
            if (info.equals("name")) {
                System.out.println(book.getName());
            }
            else {
                System.out.println(book);
            }
        }
    }
}
