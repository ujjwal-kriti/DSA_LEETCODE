class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int max_p=0;
        int min_p=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
            if(prices[i]<min_p){
                min_p=prices[i];
            }
            int profit=prices[i]-min_p;
            if(profit>max_p){
                max_p=profit;
            }

       }
       return max_p;
    }
}