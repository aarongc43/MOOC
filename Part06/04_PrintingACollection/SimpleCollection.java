import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name= name;
        this.elements= new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public void removeAllElements() {
        this.elements.clear();
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String toString() {
        // Create a variable to print out elements
        String printOut = "";

        for (String chars: elements) {
            printOut = printOut + "\n" + chars;
        }

        if (elements.size() >= 1) {
            return "The collection " + this.name + " has " + elements.size() + " elements:" +  printOut;
        } else {
            return "The collection " + this.name + " is empty.";
        }
    }
}
