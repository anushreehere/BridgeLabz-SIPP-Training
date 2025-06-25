package string;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateNumberFormat(String text) {
        // This will crash if text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("Parsed number: " + number);
    }

    public static void handleNumberFormat(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        // generateNumberFormat(input); // Uncomment to crash
        handleNumberFormat(input);      // Safe version
        sc.close();
    }
}
