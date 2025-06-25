import java.util.Scanner;

public class FriendsCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Amar's age and height: ");
        int age1 = scanner.nextInt();
        int height1 = scanner.nextInt();

        System.out.print("Enter Akbar's age and height: ");
        int age2 = scanner.nextInt();
        int height2 = scanner.nextInt();

        System.out.print("Enter Anthony's age and height: ");
        int age3 = scanner.nextInt();
        int height3 = scanner.nextInt();

        // Youngest
        if (age1 <= age2 && age1 <= age3) {
            System.out.println("Amar is the youngest.");
        } else if (age2 <= age1 && age2 <= age3) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Tallest
        if (height1 >= height2 && height1 >= height3) {
            System.out.println("Amar is the tallest.");
        } else if (height2 >= height1 && height2 >= height3) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }
    }
}
