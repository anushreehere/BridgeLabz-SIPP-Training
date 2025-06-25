import java.util.Scanner;

public class classAndObj {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Food items for restaurants
        String[] foodItems1 = {"Pizza", "Pasta", "Burger"};
        String[] foodItems2 = {"Sushi", "Ramen", "Tempura"};

        // Create Restaurant objects
        Restaurant restaurant1 = new Restaurant("Italian Delight", "Downtown", foodItems1);
        Restaurant restaurant2 = new Restaurant("Tokyo Treats", "Uptown", foodItems2);

        // Display restaurant details
        System.out.println("=== Restaurant 1 ===");
        restaurant1.displayDetails();
        System.out.println("\n=== Restaurant 2 ===");
        restaurant2.displayDetails();

        // Ask user for food item to search
        System.out.print("\nEnter a food item to check availability in Italian Delight: ");
        String foodSearch1 = scanner.nextLine();

        System.out.print("Enter a food item to check availability in Tokyo Treats: ");
        String foodSearch2 = scanner.nextLine();

        // Check food availability
        System.out.println("\nChecking Food Availability:");
        System.out.println("Is " + foodSearch1 + " available in Italian Delight? " +
                restaurant1.isFoodAvailable(foodSearch1));
        System.out.println("Is " + foodSearch2 + " available in Tokyo Treats? " +
                restaurant2.isFoodAvailable(foodSearch2));

        scanner.close();
    }
}

class Restaurant {
    private String name;
    private String location;
    private String[] foodItems;

    public Restaurant(String name, String location, String[] foodItems) {
        this.name = name;
        this.location = location;
        this.foodItems = foodItems;
    }

    public void displayDetails() {
        System.out.println("Restaurant Name: " + name);
        System.out.println("Location: " + location);
        System.out.println("Food Items:");
        for (String item : foodItems) {
            System.out.println("- " + item);
        }
    }

    public boolean isFoodAvailable(String food) {
        for (String item : foodItems) {
            if (item.equalsIgnoreCase(food)) {
                return true;
            }
        }
        return false;
    }
}
