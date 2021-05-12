public class Main {

    public static void main(String[] args) {
        Pet lucy = new Pet("Lucy" , "Golden Retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }
}
