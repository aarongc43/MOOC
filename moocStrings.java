import java.util.Scanner;

public class moocStrings {
    public static void main(String args[]) {
        Scanner Scanner = new Scanner(System.in);

        String magicWord = "abracadabra";
        String verb = "run";
        String adverb = "quickly";
        String verse = magicWord + verb + adverb;

        System.out.println(verse);

        System.out.println("Enter the magic word to access: ");
        String compareMagicWord = Scanner.nextLine();

        if (compareMagicWord.equals(magicWord)) {
            System.out.println("You're in!");
        }
        else {
            System.out.println("You've been denied");
        }

        System.out.println("Make sure the text is not a cake.");
        String text = Scanner.nextLine();

        if (!(text.equals("cake"))) {
            System.out.println("it wasn't");
        }
        else {
            System.out.println("It was!");
        }

        //Line By Line
        //Read input from the user and split each word to a line
        System.out.println("Enter some text: ");
        String input = Scanner.nextLine();

        if (input.equals("")) {
            System.out.println("Halted");
        }
        String[] pieces = input.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }

        System.out.println("Enter some text and then enter a string to search for that within your given text.");
        String stringSearch = Scanner.nextLine();
        avClub(stringSearch);

        fixedFormatText();
    }

    public static void avClub (String input) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a word to search for that word in your string.");
        String searchWord = Scanner.nextLine();

        if (input.contains(searchWord)) {
            System.out.println(searchWord + " was found.");
        }
        else {
            System.out.println(searchWord + " was not found. Try again.");
        }
    }

    public static void fixedFormatText () {
        Scanner Scanner = new Scanner(System.in);

        while (true) {
            String input = Scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            System.out.println("Name: " + pieces + pieces[0] + " Age: " + pieces[1])
        }
    }
}
