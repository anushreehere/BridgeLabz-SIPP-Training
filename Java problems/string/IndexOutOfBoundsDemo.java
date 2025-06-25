package string;

import java.util.Scanner;

public class IndexOutOfBoundsDemo {
    public static void generateStringIndexOutOfBounds(String text) {
        System.out.println("Accessing character at index 100: " + text.charAt(100)); // unsafe
    }

    public static void handleStringIndexOutOfBounds(String text) {
        try {
            System.out.println("Accessing character at index 100: " + text.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

        // generateStringIndexOutOfBounds(input); // Uncomment to crash
        handleStringIndexOutOfBounds(input);     // Safe execution
        sc.close();
    }
}
