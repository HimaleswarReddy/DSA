package apna.arrays;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {

        int bp = prices[0];//bp means buy price
        int maxp = 0; // maxp means max profit

        for (int i = 1; i < prices.length; i++) {

            if(prices[i] - bp > maxp) {
                maxp = prices[i] - bp;
            }
            bp = Math.min(bp, prices[i]);
        }

        return maxp;
    }
}
