public class Apartment {
    private int rooms;
    private int squares;
    private int pricePerSquare;

    public Apartment(int rooms, int squares , int pricePerSquare) {
        this.rooms = rooms;
        this.square = sqaures;
        this.pricePerSquare = pricePerSquare;
    }

    // Create methods to compare apartments
    // Comapare: sizes, Price Difference, More expensive?
    
    // Comparing sizes
    public boolean largerThan(Apartment compared) {
        // returns true if the apartment object wose method is called has larger
        // total area than the apatment of the object being compared
        if (this.square < compared.square) {
            return true;
        }
        else {
            return false;
        }
    }

    public String toString() {
        return this.square + " is greater";
    }
}

