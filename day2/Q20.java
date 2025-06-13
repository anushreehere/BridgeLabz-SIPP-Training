package day2;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The swapped numbers are " + a + " and " + b);
    }
}
