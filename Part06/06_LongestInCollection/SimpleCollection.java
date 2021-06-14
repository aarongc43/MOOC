import java.util.ArrayList;

public class SimpleCollection {
    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

    public String longest() {
        if (this.elements.isEmpty()) {
            return null;
        }

        //creating a variable and assigning it to the first index
        //once the first element is compared it will be compare the 2nd an 3rd ...
        //if anything is longer than the first index of elements then longest is the new things
        String longest = this.elements.get(0);

        for (String things: this.elements) {
            if (things.length() > longest.length()) {
                longest = things;
            }
        }
        return longest;
    }
} 
