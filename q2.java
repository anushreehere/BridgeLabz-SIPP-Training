public class q2 {
    public static void main(String[] args) {
        int costPrice = 129;
        int sellingPrice = 191;

        int profit = sellingPrice - costPrice;
        double profitPercentage = (profit * 100.0) / costPrice;

        System.out.println(
            "The Cost Price is INR " + costPrice + " and the Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage
        );
    }
}
