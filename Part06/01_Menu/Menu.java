import java.util.ArrayList;

public class Menu {
    private ArrayList<String> meals;

    public Menu() {
        this.meals = new ArrayList<>();
    }

    public void addMeal(String meal) {
        if (meals.contains(meal)) {
            System.out.println(meal + " exists enter another");
        } else {
            this.meals.add(meal);
            System.out.println(meal + " was added.");
        }
    }

    public void printMeals() {
        System.out.println("Today's Menu: ");
        if (this.meals.isEmpty()) {
            System.out.println("Empty...");
        } else {
            for (String meals: this.meals) {
                System.out.println(meals);
            }
        }
    }

    public void clearMenu() {
        System.out.println("Clearing the menu...");
        this.meals.removeAll(meals);
    }

}
