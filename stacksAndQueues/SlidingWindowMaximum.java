import java.util.*;

public class SlidingWindowMaximum {
    public static List<Integer> maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            while (!dq.isEmpty() && dq.peek() < i - k + 1)
                dq.poll();

            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i])
                dq.pollLast();

            dq.offer(i);
            if (i >= k - 1)
                result.add(nums[dq.peek()]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        System.out.println("Sliding Window Maximums: " + maxSlidingWindow(nums, k));
    }
}

