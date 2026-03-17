    class Solution {
        public int coinChange(int[] coins, int amount) {
            //--------------------greedy approach--------------

        // Arrays.sort(coins);
        // int count=0;
        // for(int i=coins.length-1;i>=0;i--){
        //         while(amount>=coins[i]){
        //             amount-=coins[i];
        //             count++;
        //         }
        // }
        // if(amount!=0){
        //     return -1;
        // }
        // return count;

        //----------------------tabulation approach-----------
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0]=0;
        for(int i=1;i<=amount;i++){
            for(int coin:coins){
               if(i>=coin){
                int remaining_coin=i-coin;
                int totalcoins=1+dp[remaining_coin];
                dp[i]=Math.min(dp[i],totalcoins);
               }
            }
        }
        if(dp[amount]>amount){
            return -1;
        }else{
            return dp[amount];
        }

        }
    }