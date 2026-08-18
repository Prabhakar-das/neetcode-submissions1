public class Solution {
    public int maxProfit(int[] prices) {
        int res = Integer.MAX_VALUE;
        int ans =0;
        for (int i = 0; i < prices.length; i++) {
            res = Math.min(res, prices[i]);
            ans = Math.max(ans, prices[i]-res);
        }
        return ans;
    }
}

