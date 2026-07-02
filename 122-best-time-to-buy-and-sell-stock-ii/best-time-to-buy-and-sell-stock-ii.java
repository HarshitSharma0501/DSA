class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxprofit=0;
        int n = prices.length;
        for(int i=1;i<n;i++){
            int cost = prices[i]-prices[i-1];
            if(cost>0){
                maxprofit+=cost;
            }
        }
        return maxprofit;
    }
}