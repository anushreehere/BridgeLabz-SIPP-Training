import java.util.Stack;

public class StockSpanProblem {
    public static void calculateSpan(int[] price, int n, int[] span) {
        Stack<Integer> s = new Stack<>();
        s.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && price[s.peek()] <= price[i])
                s.pop();
            span[i] = (s.isEmpty()) ? (i + 1) : (i - s.peek());
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] span = new int[n];
        calculateSpan(price, n, span);

        for (int s : span)
            System.out.print(s + " ");
    }
}

