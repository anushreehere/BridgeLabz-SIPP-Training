import java.util.Scanner;

public class DistributeChocolates {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int quotient = chocolates / children;
        int remainder = chocolates % children;
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates and number of children: ");
        int chocolates = sc.nextInt(), children = sc.nextInt();
        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates, Remaining: " + result[1]);
        sc.close();
    }
}
