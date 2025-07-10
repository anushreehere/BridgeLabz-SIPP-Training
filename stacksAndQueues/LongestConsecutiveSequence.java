import java.util.*;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);

        int maxStreak = 0;

        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num, streak = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    streak++;
                }
                maxStreak = Math.max(maxStreak, streak);
            }
        }

        return maxStreak;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + longestConsecutive(nums));
    }
}

