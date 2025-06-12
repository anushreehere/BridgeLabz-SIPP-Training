import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        double distanceInFeet = input.nextDouble();

        double distanceInYards = distanceInFeet / 3.0;          // 1 yard = 3 feet
        double distanceInMiles = distanceInYards / 1760.0;      // 1 mile = 1760 yards

        System.out.println("The distance in yards is " + String.format("%.2f", distanceInYards) + " while the distance in miles is " + String.format("%.5f", distanceInMiles));

        input.close();
    }
}
