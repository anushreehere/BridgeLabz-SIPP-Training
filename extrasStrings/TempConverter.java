import java.util.Scanner;

public class TempConverter {
    public static double toCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    public static double toFahrenheit(double c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Convert to (1) Celsius or (2) Fahrenheit? Enter 1 or 2: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.print("Enter Fahrenheit: ");
            double f = sc.nextDouble();
            System.out.println("Celsius: " + toCelsius(f));
        } else {
            System.out.print("Enter Celsius: ");
            double c = sc.nextDouble();
            System.out.println("Fahrenheit: " + toFahrenheit(c));
        }
    }
}
