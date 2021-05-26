public class Main {
    public static void main(String[] args) {
        Apartment manhattanStudioApt = new Apartment("Manhattan Apartment", 1, 16, 5500);
        Apartment atlantaTwoBedroomApt = new Apartment("Atlanta Apartment", 2, 38, 4200);
        Apartment bangorThreeBedroomApt = new Apartment("Bangor Aprtment", 3, 78, 2500);

        System.out.println(manhattanStudioApt.largerThan(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.largerThan(atlantaTwoBedroomApt));

        System.out.println(manhattanStudioApt.priceDifference(atlantaTwoBedroomApt));
        System.out.println(bangorThreeBedroomApt.priceDifference(atlantaTwoBedroomApt));
    }
}
