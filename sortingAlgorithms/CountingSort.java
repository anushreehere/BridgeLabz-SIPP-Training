public class CountingSort {
    public static void main(String[] args) {
        int[] ages = {12, 15, 11, 14, 10, 18, 13, 12};

        int max = 18, min = 10;
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[ages.length];

        for (int age : ages)
            count[age - min]++;

        for (int i = 1; i < count.length; i++)
            count[i] += count[i - 1];

        for (int i = ages.length - 1; i >= 0; i--) {
            output[count[ages[i] - min] - 1] = ages[i];
            count[ages[i] - min]--;
        }

        System.out.print("Sorted Ages: ");
        for (int age : output)
            System.out.print(age + " ");
    }
}
