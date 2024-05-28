class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int date=0; 
        for(int i=0;i<prices.length;i++){
            int profit= prices[i]-prices[date];
            max=Math.max(profit,max);
            if(profit<0){
                date=i;
            }
        }
        return max;
    }
}
