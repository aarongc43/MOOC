import java.util.ArrayList;

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> suitcases;

    public Hold( int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcases = new ArrayList<>();      // need to create an array list bruh
    }

    public void addSuitcase(Suitcase suitcase) {
        int holdWeight = 0;

        // for each suitcase in the array we are going to add up all the weight
        // to see if it exceeds the maxWeight variable set when creating a new hold
        for (Suitcase s: suitcases) {
            holdWeight += s.totalWeight();
        }

        // compare the weight in the hold to the totalweight of the suitcases
        if ((this.maxWeight - holdWeight) >= suitcase.totalWeight()) {
            this.suitcases.add(suitcase);
        } 
    }

    public int holdSize() {
        return suitcases.size();
    }

    public void printItems() {
        for (Suitcase s: suitcases) {
            s.printItems();
        }
    }

    public String toString() {
        int totalWeight = 0;
        
        for (Suitcase s: suitcases) {
            totalWeight += s.totalWeight();
        }
        return  holdSize() + " suitcases (" + totalWeight + " kg)";
    }
}
