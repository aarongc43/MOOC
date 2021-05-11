import java.util.Scanner;

public class Program {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Book b = new Book("J. K. Rowling", "Harry Potter", 223);
        System.out.println(b);
    }
}
