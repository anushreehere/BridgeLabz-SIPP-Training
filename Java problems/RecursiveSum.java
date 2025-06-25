import java.util.Scanner;

public class RecursiveSum {

    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input. Please enter a positive number.");
        } else {
            int recursiveSum = sumRecursive(n);
            int formulaSum = sumFormula(n);
            System.out.println("Recursive Sum: " + recursiveSum);
            System.out.println("Formula Sum: " + formulaSum);
            System.out.println("Are both equal? " + (recursiveSum == formulaSum));
        }
        sc.close();
    }
}

