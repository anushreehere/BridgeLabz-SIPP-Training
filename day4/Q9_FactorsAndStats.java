import java.util.*;
public class Q9_FactorsAndStats {
    public static int[] findFactors(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) if (n % i == 0) list.add(i);
        return list.stream().mapToInt(i -> i).toArray();
    }
    public static int sum(int[] arr) {
        int sum = 0; for (int i : arr) sum += i;
        return sum;
    }
    public static int product(int[] arr) {
        int product = 1; for (int i : arr) product *= i;
        return product;
    }
    public static double sumOfSquares(int[] arr) {
        double sum = 0; for (int i : arr) sum += Math.pow(i, 2);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int[] factors = findFactors(n);
        System.out.println("Factors: " + Arrays.toString(factors));
        System.out.println("Sum: " + sum(factors));
        System.out.println("Product: " + product(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
    }
}