class Solution {
    public int maxProfit(int[] prices) {
        int minprice=prices[0];
        int maxp=0;
        for(int i=1;i<prices.length;i++){
                minprice=Math.min(minprice,prices[i]);
                maxp=Math.max(maxp,prices[i]-minprice);
            
        }
        return maxp;
    }
}