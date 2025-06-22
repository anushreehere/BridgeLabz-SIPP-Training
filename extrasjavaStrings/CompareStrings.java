public class CompareStrings {
    public static String compare(String a, String b) {
        int len = Math.min(a.length(), b.length());
        for (int i = 0; i < len; i++) {
            if (a.charAt(i) < b.charAt(i)) return a + " comes before " + b;
            else if (a.charAt(i) > b.charAt(i)) return b + " comes before " + a;
        }
        return a.length() < b.length() ? a + " comes before " + b : a.equals(b) ? "Both are equal" : b + " comes before " + a;
    }

    public static void main(String[] args) {
        System.out.println(compare("apple", "banana"));
    }
}
