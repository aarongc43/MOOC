public class main {
    public static void main(String[] args) {
        Gift book = new Gift("Harry Potter and the Philosopher's Stone", 2);

        System.out.println("Gift's name " + book.getName());
        System.out.println("Gifts' weight " + book.getWeight());

        System.out.println("Gift: ", book);
    }
}
