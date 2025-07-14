import java.util.*;

public class MissingPositiveAndBinarySearch {
    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        Arrays.sort(arr);
        
        int missing = 1;
        for (int num : arr) {
            if (num == missing) {
                missing++;
            }
        }
        System.out.println("First missing positive: " + missing);

        // Binary Search
        int target = 4;
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println("Found at index: " + mid);
                return;
            } else if (arr[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        System.out.println("Target not found");
    }
}
