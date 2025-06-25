package day2;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers " + a + " and " + b + " is " +
                (a + b) + ", " + (a - b) + ", " + (a * b) + ", and " + (a / b));
    }
}
