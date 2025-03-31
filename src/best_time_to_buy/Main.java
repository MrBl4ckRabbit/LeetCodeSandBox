package best_time_to_buy;

public class Main {
    public static void main(String[] args) {
        int[] array = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(array));
    }

    public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else if (prices[i] - buy > profit) {
                profit = prices[i] - buy;
            }
        }
        return profit;
    }
}
