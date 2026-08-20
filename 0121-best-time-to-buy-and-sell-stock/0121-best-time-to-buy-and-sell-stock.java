class Solution {
    public int maxProfit(int[] prices) {
         int bp=Integer.MAX_VALUE;
         int maxprofit=0;
         int profit=0;

         for(int i=0;i<prices.length;i++){
            bp=Math.min(bp,prices[i]);
            if(bp<prices[i]){
               profit=prices[i]-bp;
            }
            maxprofit=Math.max(profit,maxprofit);
         }
         return maxprofit;

    }
}