class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       // return helper(nums,0,target);
    //}
    // public int helper(int[] nums, int i,int target){
    //     if(i==nums.length) {
    //         if(target==0) return 1;
    //         else return 0;
    //     }
    //     int add=helper(nums,i+1,target-nums[i]);
    //     int sub=helper(nums,i+1,target+nums[i]);
    //     return add+sub;

    // }

// using tabulation method
      int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        // invalid cases
        if ((target + totalSum) % 2 != 0 || Math.abs(target) > totalSum) {
            return 0;
        }

        int sum = (target + totalSum) / 2;
        int n = nums.length;

        int[][] dp = new int[n + 1][sum + 1];

        // base case
        dp[0][0] = 1;

        // loops (main tabulation)
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                // not take
                dp[i][j] = dp[i - 1][j];

                // take
                if (j >= nums[i - 1]) {
                    dp[i][j] += dp[i - 1][j - nums[i - 1]];
                }
            }
        }

        return dp[n][sum];

    }
}