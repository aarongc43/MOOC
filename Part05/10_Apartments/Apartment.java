public class Apartment {
    private String name;
    private int rooms;
    private int square;
    private int pricePerSquare;

    public Apartment(String name, int rooms, int square , int pricePerSquare) {
        this.name = name;
        this.rooms = rooms;
        this.square = square;
        this.pricePerSquare = pricePerSquare;
    }

    // Create methods to compare apartments
    // Comapare: sizes, Price Difference, More expensive?
    
    // Comparing sizes
    public String getName() {
        return name;
    }
    
    public boolean largerThan(Apartment compared) {
        // returns true if the apartment object wose method is called has larger
        // total area than the apatment of the object being compared
        if (this.square > compared.square) {
            System.out.println(name + " is bigger than " + compared.name);
            return true;
        }
        else {
            System.out.println(name + " is smaller than " + compared.name);
            return false;
        }
    }

    public int priceDifference(Apartment compared) {
        //returns the price difference of the compared apartments
        int priceDifference = 0;
        priceDifference = ((this.square * this.pricePerSquare) - (compared.square * compared.pricePerSquare));

        if ((this.square * this.pricePerSquare) > (compared.square * compared.pricePerSquare)) {
            System.out.println(this.name + " is more expensive than " + compared.name);
            return priceDifference;
        }
        else {
            System.out.println(compared.name + " is more expensive than " + this.name);
            return priceDifference;
        }
    }

    public String toString() {
        return this.square + " is greater";
    }
}

