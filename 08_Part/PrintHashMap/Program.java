import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        HashMap<String, Book> hashmapBooks = new HashMap<>();

        hashmapBooks.put("sense", new Book("Sense and Sensibility", 1811, "...."));
        hashmapBooks.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        hashmap.put("f.e.", "for example");
        hashmap.put("etc", "and so on");
        hashmap.put("i.e.", "more precisely");

        printKeys(hashmap);
        System.out.println("-----");
        printKeysWhere(hashmap, "i");
        System.out.println("-----");
        printValuesOfKeysWhere(hashmap, ".e");

        System.out.println();

        printValues(hashmapBooks);
        System.out.println("-----");
        printValuesIfNameContains(hashmapBooks, "prejud");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String abbreviation: hashmap.keySet()) {
            System.out.println(abbreviation);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String abbreviation: hashmap.keySet()) {
            if (abbreviation.contains(text)) {
                System.out.println(abbreviation);
            }
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String abbreviation: hashmap.keySet()) {
            if (abbreviation.contains(text)) {
                System.out.println(hashmap.get(abbreviation));
            }
        }
    }

    public static void printValues(HashMap<String, Book> hashmapBooks) {
        for (Book book: hashmapBooks.values()) {
            System.out.println(book);
        }
    }

    public static void printValuesIfNameContains(HashMap<String, Book> hashmapBooks, String text) {
        for (Book book: hashmapBooks.values()) {

            if(book.getName().contains(text)) {
                System.out.println(book);
            }
        }
    }
}
