import java.util.Scanner;

public class q19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter To City: ");
        String toCity = input.nextLine();

        System.out.print("Enter distance from From City to Via City in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from Via City to Final City in miles: ");
        double viaToFinalCity = input.nextDouble();

        System.out.print("Enter time taken from From City to Via City in minutes: ");
        int timeFromToVia = input.nextInt();

        System.out.print("Enter time taken from Via City to Final City in minutes: ");
        int timeViaToFinalCity = input.nextInt();

        double totalDistance = (fromToVia + viaToFinalCity) * 1.60934; // Convert to km
        int totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + String.format("%.2f", totalDistance) +
                " km and the Total Time taken is " + totalTime + " minutes");

        input.close();
    }
}
