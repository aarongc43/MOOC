import java.util.ArrayList;

public class Suitcase {
    private int weight;
    private ArrayList<Item> items;

    public Suitcase(int weight) {
        this.weight = weight;
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        int suitcaseWeight = 0;

        for (Item i: items) {
            suitcaseWeight += i.getWeight();
        }

        this.items.add(item);
    }

    public int totalWeight() {
        int suitcaseWeight = 0;

        for (Item i: items) {
            suitcaseWeight += i.getWeight();
        }

        return suitcaseWeight;
    }

    public Item heaviestItem() {
        Item temp = this.items.get(0);

        for (Item i : items) {
            if (i.getWeight() > temp.getWeight()) {
                temp = i;
            }
        }
        return temp; 

    }

    public void printItems() {
        for (Item i : items) {
            System.out.println(i);
        }
    }

    public String toString() {
        int suitcaseWeight = 0;

        for (Item i: items) {
            suitcaseWeight += i.getWeight();
        }

        if (items.isEmpty()) {
            return "no items (" + suitcaseWeight + "kg)";
        } else if (items.size() == 1) {
            return this.items.size() + " item (" + suitcaseWeight + "kg)";
        } else {
            return this.items.size() + " items (" + suitcaseWeight + "kg)";
        }
    }
}
