class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int max = prices[n-1];
        int ans = 0;
        int profit = 0;
        for(int i = n-2; i >=0; i--){
            max = Math.max(max, prices[i]);
            profit = max - prices[i];
            ans = Math.max(ans, profit);
        }
        return ans;
    }
}