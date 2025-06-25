import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scanner.nextInt();
        int fact = 1;

        if (num >= 0) {
            for (int i = 1; i <= num; i++) {
                fact *= i;
            }
            System.out.println("Factorial is: " + fact);
        } else {
            System.out.println("Please enter a positive number.");
        }
    }
}
