public class BestTimeToBuyandSellStock {
    public int maxProfit(int[] prices) {
        // Looked at answers because I didn't get sliding window principal

        int startOfWindow = 0;
        int endOfWindow = 1;
        int maxProfit = 0;

        while (endOfWindow < prices.length) {
            if (prices[startOfWindow] < prices[endOfWindow]) {
                maxProfit = Math.max(maxProfit, (prices[endOfWindow] - prices[startOfWindow]));
                endOfWindow++;
            } else {
                startOfWindow = endOfWindow;
                endOfWindow++;
            }
        }
        return maxProfit;
    }
}
