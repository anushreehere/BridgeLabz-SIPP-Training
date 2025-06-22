import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String a, String b) {
        char[] arr1 = a.replaceAll("\\s", "").toLowerCase().toCharArray();
        char[] arr2 = b.replaceAll("\\s", "").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("Listen", "Silent") ? "Anagrams" : "Not Anagrams");
    }
}
