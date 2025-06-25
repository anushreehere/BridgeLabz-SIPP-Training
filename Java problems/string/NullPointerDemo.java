package string;

public class NullPointerDemo {
    public static void generateNullPointer() {
        String text = null;
        System.out.println("Length of string: " + text.length()); // Will throw exception
    }

    public static void handleNullPointer() {
        try {
            String text = null;
            System.out.println("Length of string: " + text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // generateNullPointer(); // Uncomment to see unhandled exception
        handleNullPointer();      // Safe call
    }
}
