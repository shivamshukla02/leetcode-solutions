import java.util.Arrays;

class Solution {
    public int buyChoco(int[] prices, int money) {
        int orgmoney = money;
        int c = 0;
        Arrays.sort(prices);
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= money) {
                money = money - prices[i];
                c++;}
            if (c == 2) {
                return money;}}
        return orgmoney;
    }
}