public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam") ? "Palindrome" : "Not Palindrome");
    }
}
