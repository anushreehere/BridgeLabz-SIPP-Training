public class MostFrequentChar {
    public static char mostFrequent(String str) {
        int[] count = new int[256];
        for (char ch : str.toCharArray()) count[ch]++;
        int max = 0;
        char result = ' ';
        for (char ch : str.toCharArray()) {
            if (count[ch] > max) {
                max = count[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Most Frequent: " + mostFrequent("success"));
    }
}

