class Solution {
    public int maxProfit(int[] prices) {
        int i = 0;
        int j = 1;
        int max = 0; 
        while (j < prices.length) {
            if (prices[j] > prices[i]) {
                int profit = prices[j] - prices[i];
                if (profit > max) {
                    max = profit;}
            } else {
                i = j;}
            j++;}
        return max;
    }
}