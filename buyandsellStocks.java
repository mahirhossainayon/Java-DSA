public class buyandsellStocks {
    public static int bsStocks(int prices[]) {
        int maxProfit = 0;
        int buyingP = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (buyingP > prices[i]) {
                buyingP = prices[i];
            } else {
                int Profit = prices[i] - buyingP;
                maxProfit = Math.max(maxProfit, Profit);
            }
        }
        return maxProfit;
    }

    public static void main(String args[]) {

        int prices[] = { 7, 1, 5, 3, 6, 4 };
        int waterArea = bsStocks(prices);
        System.out.println(waterArea);

    }

}
