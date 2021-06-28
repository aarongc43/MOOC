import java.util.Scanner;
import java.lang.*;
import java.util.ArrayList;

public class Searching {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        System.out.println("How many books to create?");
        int numberOfBooks = Integer.valueOf(scanner.nextLine());
        
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(new Book(i, "name for the book " + i));
        }

        System.out.println("Id of the book to search for?");
        int idToSearchFor = Integer.valueOf(scanner.nextLine());

        System.out.println("");
        System.out.println("Searching with linear search:");
        long start = System.nanoTime();
        int linearSearchId = linearSearch(books, idToSearchFor);
        System.out.println("The search took " + (System.nanoTime() - start) + " nanoseconds.");

        if (linearSearchId < 0) {
            System.out.println("Book not found. 404 error.");
        } else {
            System.out.println("Found it. " + books.get(linearSearchId));
        }

        System.out.println();

        System.out.println();
        System.out.println("Searching with binary search.");
        start = System.nanoTime();
        int binarySearchId = binarySearch(books, idToSearchFor);
        System.out.println("The search took " + (System.nanoTime() - start) + " nanoseconds.");

        if (binarySearchId < 0) {
            System.out.println("Book not found.");
        } else {
            System.out.println("Found it. " + books.get(binarySearchId));
        }

        System.out.println();

    }

    public static int linearSearch(ArrayList<Book> books, int searchedId) {

        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getId() == searchedId) {
                return i;
            }
        }

        return -1;
    }

    public static int binarySearch(ArrayList<Book> books, int searchedId) {

        int start = 0;
        int end = books.size() - 1;

        while (start <= end) {
            int middle = (end + start) / 2;

            if (books.get(middle).getId() == searchedId) {
                return middle;
            }

            if (books.get(middle).getId() < searchedId) {
                start = middle + 1;
            }

            if (books.get(middle).getId() > searchedId) {
                end = middle - 1;
            }
            
        }
        return -1;
    }
}
