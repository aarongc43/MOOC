public class main {
    public static void main(String[] args) {
        Menu card = new Menu();
        
        card.addMeal("Fish");
        card.addMeal("Tacos");
        card.addMeal("Tacos");

        card.printMeals();

        card.clearMenu();

        card.printMeals();
    }
}
