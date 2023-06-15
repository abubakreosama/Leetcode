class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] highestSellPossible  = new int[n];
        int profit = 0;
        highestSellPossible[n - 1] = prices[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (prices[i] >= highestSellPossible[i+1]) {
                highestSellPossible[i] = prices[i];
            }
            else {
                highestSellPossible[i] = highestSellPossible[i + 1];
            }
        }

        for (int i = 0; i < prices.length; i++) {
            if (highestSellPossible[i] - prices[i] > profit) {
                profit = highestSellPossible[i]-prices[i];
            }
        }
        return profit;

    }
}