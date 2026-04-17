class Solution {
    public int change(int amount, int[] coins) {
    //     return helper(amount, 0 , coins);
    // }
    // public int helper(int amount, int i, int[] coins){
    //     if(amount==0) return 1;
    //     if(i==coins.length) return 0;
    //     int take=0;
    //     if(coins[i]<=amount){
    //         take=helper(amount-coins[i],i,coins);
    //     }
    //         int nottake=helper(amount,i+1,coins);
        

    //     return nottake+take;
    
    // using dp
    int n=coins.length;
    int[][] dp=new int[n+1][amount+1];
//     for(int i = 0; i <= n; i++){
//     dp[i][0] = 1;
// }
   dp[0][0]=1;
    for(int i=1;i<=n;i++){
        for(int j=0;j<=amount;j++){
            dp[i][j]=dp[i-1][j];
            if(coins[i-1]<=j){
                dp[i][j]+=dp[i][j-coins[i-1]];
            }
        }
    }
    return dp[n][amount];
    }
}