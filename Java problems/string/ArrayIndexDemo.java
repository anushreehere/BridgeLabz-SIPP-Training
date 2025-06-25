package string;

import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generateArrayIndex(String[] names, int index) {
        System.out.println("Accessing: " + names[index]); // May crash
    }

    public static void handleArrayIndex(String[] names, int index) {
        try {
            System.out.println("Accessing: " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String[] names = {"Ram", "Shyam", "Geeta"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter index to access: ");
        int index = sc.nextInt();

        // generateArrayIndex(names, index); // Uncomment to crash
        handleArrayIndex(names, index);     // Safe version
        sc.close();
    }
}
