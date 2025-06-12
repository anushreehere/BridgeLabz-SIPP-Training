import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in); // Scanner to take input from keyboard

        System.out.print("Enter distance in kilometers: ");
        km = input.nextInt(); // Read input as integer and store in km

        double miles = km / 1.6; // 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");

        input.close(); // Close scanner
    }
}
