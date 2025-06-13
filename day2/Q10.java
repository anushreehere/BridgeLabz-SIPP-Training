package day2;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        System.out.println("The results of Int Operations are " + (a + b * c) + ", " + (a * b + c) + ", " + (c + a / b) + ", " + (a % b + c));
    }
}
