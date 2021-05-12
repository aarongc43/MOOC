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
        String userInput = Scanner.nextLine();

        if (userInput.equals(magicWord)) {
            System.out.println("You're in!");
        }
        else {
            System.out.println("You've been denied");
        }

        System.out.println("Make sure the text is not a cake.");

        if (!(userInput.equals("cake"))) {
            System.out.println("it wasn't");
        }
        else {
            System.out.println("It was!");
        }

        //Line By Line
        //Read input from the user and split each word to a line
        System.out.println("Enter some text: ");

        if (userInput.equals("")) {
            System.out.println("Halted");
        }
        String[] pieces = userInput.split(" ");

        for (int i = 0; i < pieces.length; i++) {
            System.out.println(pieces[i]);
        }

        System.out.println("Enter some text and then enter a string to search for that within your given text.");
        avClub(userInput);

        System.out.println("Enter the names and values separated by a comma for each person(name,int): ");
        fixedFormatText();

        System.out.println("Enter a small sentence for the first and last word to be returned.");
        firstWord(userInput);
        lastWord(userInput);
    }

    public static void avClub (String input) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a word to search for that word in your string.");
        String searchWord = Scanner.nextLine();
        int j = 0;

        String[] string = input.split(" ");
        for (int i = 0; i < string.length; i++) {
            if (searchWord.equals(string[i])) {
                j++;
            }    
        }

        if (input.contains(searchWord)) {
            System.out.println(searchWord + " was found " + j + " times.");
        }
        else {
            System.out.println(searchWord + " was not found at all.");
        }
    }

    public static void fixedFormatText() {
        Scanner Scanner = new Scanner(System.in);

        while (true) {
            String input = Scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] pieces = input.split(",");
            System.out.println("Name: " + pieces[0] + " Age: " + pieces[1]);
        }
    }
    
    public static void firstWord(String word) {
        System.out.println(word);
        
        String[] firstWord = word.split(" ");

        System.out.println(firstWord[0]);
    }

    public static void lastWord(String word) {
        String[] lastWord = word.split(" ");

        int i = lastWord.length;
        System.out.println(lastWord[i - 1]);
    }
}
