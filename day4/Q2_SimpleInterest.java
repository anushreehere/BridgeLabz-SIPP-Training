import java.util.Scanner;
public class Q2_SimpleInterest {
    public static double calculateSimpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Principal: ");
        double p = sc.nextDouble();
        System.out.print("Rate: ");
        double r = sc.nextDouble();
        System.out.print("Time: ");
        double t = sc.nextDouble();
        double si = calculateSimpleInterest(p, r, t);
        System.out.println("Simple Interest = " + si + " for Principal " + p + ", Rate " + r + ", Time " + t);
    }
}