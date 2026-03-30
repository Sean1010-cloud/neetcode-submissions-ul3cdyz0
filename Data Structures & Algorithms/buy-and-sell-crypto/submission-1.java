class Solution {
    public int maxProfit(int[] prices) {
        int minSoFar = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minSoFar) {
                minSoFar = price; 
            } else {
                int profit = price - minSoFar;
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }

        return maxProfit;
    }
}