package day2;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p = sc.nextDouble(), r = sc.nextDouble(), t = sc.nextDouble();
        double si = (p * r * t) / 100;
        System.out.println("The Simple Interest is " + si + " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}
