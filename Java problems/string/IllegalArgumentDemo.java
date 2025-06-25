package string;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generateIllegalArgument(String text) {
        // This will cause IllegalArgumentException
        System.out.println("Substring with invalid indexes: " + text.substring(5, 2));
    }

    public static void handleIllegalArgument(String text) {
        try {
            System.out.println("Handled substring: " + text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // generateIllegalArgument(input); // Uncomment to crash
        handleIllegalArgument(input);     // Safe version
        sc.close();
    }
}
