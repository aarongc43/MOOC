public class Main {

    public static void main(String[] args) {
        // Create new Simple Date Object
        SimpleDate date = new SimpleDate(0, 0, 0);

        date.advance();
        date.advance();
        System.out.println(date);

        date.advance(7);
        System.out.println(date);

        SimpleDate clone = date.afterNumberOfDays(9);
        System.out.println(clone);

        SimpleDate start = new SimpleDate(5,26,2021);
        System.out.println("The date after 790 days is " + start.afterNumberOfDays(790));
    }
}
