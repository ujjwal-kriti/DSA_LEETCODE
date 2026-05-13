class Solution {

    public int coinChange(int[] coins, int amount) {

        int n = coins.length;

        int[][] dp = new int[n + 1][amount + 1];

        // infinity initialization
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= amount; j++) {
                dp[i][j] = Integer.MAX_VALUE - 1;
            }
        }

        // amount 0 needs 0 coins
        for(int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }

        // first row initialization
        for(int j = 1; j <= amount; j++) {

            if(j % coins[0] == 0) {
                dp[1][j] = j / coins[0];
            }
        }

        for(int i = 2; i <= n; i++) {

            for(int j = 1; j <= amount; j++) {

                if(coins[i - 1] <= j) {

                    int take =
                        1 + dp[i][j - coins[i - 1]];

                    int not_take =
                        dp[i - 1][j];

                    dp[i][j] =
                        Math.min(take, not_take);

                }
                else {

                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        if(dp[n][amount] == Integer.MAX_VALUE - 1) {
            return -1;
        }

        return dp[n][amount];
    }
}