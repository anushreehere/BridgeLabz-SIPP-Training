import java.util.Scanner;

public class q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();

        double kg = pounds / 2.2;

        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + String.format("%.2f", kg));

        input.close();
    }
}
