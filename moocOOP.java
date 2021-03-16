public class moocOOP {

    public static void main(String args[]) {
        //Object oriented programming
        // A class defines the attributes of objects, the information related to them, and their commands, methods.
        // A method is a piece of source code written inside a class that's been named and has the ability to be called.
        // A method is always part of soem class and is often used to modify the internal state of an object instantiated from a class.
        // An object is alwasy instantiated by callign a method that created an object, a 'constructor' by using the 'new' keyword

        Whistle duckWhistle = new Whistle("Quak");
        Whistle roosterWhistle = new Whistle("Cockadoodle-doo");

        duckWhistle.sound();
        roosterWhistle.sound();

        Door aaron = new Door();

        aaron.knock();

        Product orange = new Product("Orange", 0.06, 50);
        orange.printProduct();

        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.reset();
        counter.printValue();

        // Changing an INstance Variable's Value in a Method
        Debt mortgage = new Debt(120000.00, 1.01);
        mortgage.printBalance();

        mortgage.waitOneYear();
        mortgage.printBalance();

        int years = 0;

        while (years < 20) {
            mortgage.waitOneYear();
            years = years + 1;
        }
       mortgage.printBalance(); 

       // Return a value from a method
        Song garden = new Song("In The Garden", 10910);
        System.out.println("The song " + garden.name() + " has a length of " + garden.length() + " seconds.");
    }
}
