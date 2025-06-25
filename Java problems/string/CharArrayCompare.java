package string;

import java.util.Scanner;

public class CharArrayCompare {
    public static char[] getCharacters(String text) {
        char[] chars = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            chars[i] = text.charAt(i);
        }
        return chars;
    }

    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        char[] manualArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();

        boolean isSame = compareCharArrays(manualArray, builtInArray);

        System.out.println("Are both char arrays equal? " + isSame);
        sc.close();
    }
}
