import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        // Loop to ask for books to add
        while (true) {
            System.out.println("Enter the Title of books in your library");
            System.out.println("(an empty entry will stop the program)");
            String title = scan.nextLine();

            if (title.isEmpty()) {
                break;
            }
            
            // Call Book class to add a new book to the list
            // Create a new object for the book
            Book book = new Book(title);
            
            // If Book exists in list enter a new book
            if (books.contains(book)) {
                System.out.println("The book already exists on the list. Add another book: ");
            } else {
                books.add(book);
            }
        }

        System.out.println("Thank you! Books added: ");
        for (Book book : books) {
            System.out.println(book.getName());
        }
    }
}
