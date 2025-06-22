import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    static Scanner sc = new Scanner(System.in);

    public static String getFeedback(int guess) {
        System.out.print("Is your number " + guess + "? (high/low/correct): ");
        return sc.nextLine();
    }

    public static void playGame() {
        Random rand = new Random();
        int low = 1, high = 100;
        String feedback;
        while (true) {
            int guess = rand.nextInt(high - low + 1) + low;
            feedback = getFeedback(guess);

            if (feedback.equalsIgnoreCase("correct")) {
                System.out.println("Yay! I guessed it!");
                break;
            } else if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Think of a number between 1 and 100.");
        playGame();
    }
}
