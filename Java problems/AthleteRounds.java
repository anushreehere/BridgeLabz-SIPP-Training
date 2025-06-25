import java.util.Scanner;

public class AthleteRounds {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        return (int) Math.ceil(5000 / perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 sides of the triangular park in meters: ");
        double s1 = sc.nextDouble(), s2 = sc.nextDouble(), s3 = sc.nextDouble();
        System.out.println("Rounds to complete 5km: " + calculateRounds(s1, s2, s3));
        sc.close();
    }
}

