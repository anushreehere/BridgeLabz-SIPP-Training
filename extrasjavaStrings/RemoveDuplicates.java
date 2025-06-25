public class RemoveDuplicates {
    public static String removeDup(String str) {
        String result = "";
        for (char ch : str.toCharArray())
            if (result.indexOf(ch) == -1) result += ch;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDup("programming"));
    }
}
