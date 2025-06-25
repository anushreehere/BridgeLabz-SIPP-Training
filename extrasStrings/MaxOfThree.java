import java.util.Scanner;

public class MaxOfThree {
    public static int takeInput(String label) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter " + label + ": ");
        return sc.nextInt();
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        int a = takeInput("first number");
        int b = takeInput("second number");
        int c = takeInput("third number");
        System.out.println("Maximum is: " + findMax(a, b, c));
    }
}

