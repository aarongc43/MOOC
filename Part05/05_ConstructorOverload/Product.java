public class Product {

    private String name;
    private String section;
    private int price;

    public Product(String name, String section, int price) {
        this.name = name;
        this.section = section;
        this.price = price;
    }

    public Product(String name) {
        this(name, "shelf", 1);
    }

    public Product(String name, String section) {
        this(name, section, 1);
    }

    public Product(String name, int price) {
        this(name, "Shelf", price);
    }

    public String getName() {
        return name;
    }

    public String getSection() {
        return section;
    }

    public int getPrice() {
        return price;
    }

    public String toString() {
        return name + " costs " + price + " in section " + section;
    }
}
