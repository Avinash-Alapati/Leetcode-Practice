class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minBuy = Integer.MAX_VALUE;

        for (int price : prices){
            if (price < minBuy ){
                minBuy = price;
            } else {
                maxProfit = Math.max(maxProfit , price - minBuy);
            }
        }
        return maxProfit;
    }
}