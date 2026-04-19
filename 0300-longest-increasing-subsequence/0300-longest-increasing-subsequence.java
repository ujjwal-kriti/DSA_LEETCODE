// class Solution {
//     public int lengthOfLIS(int[] nums) {
//         return helper(0,-1,nums);
//     }
//     public int helper(int ind,int previ,int[] nums){
//         if (ind == nums.length) return 0;

//         // option 1: skip current element
//         int notTake = helper(ind + 1, previ, nums);

//         // option 2: take current element (if valid)
//         int take = 0;
//         if (previ == -1 || nums[ind] > nums[previ]) {
//             take = 1 + helper(ind + 1, ind, nums);
//         }

//         // return best
//         return Math.max(take, notTake);
//     }
// }
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;

        // dp[ind][prev+1]
        int[][] dp = new int[n + 1][n + 1];

        // base case already 0 (when ind == n)

        for (int ind = n - 1; ind >= 0; ind--) {
            for (int prev = ind - 1; prev >= -1; prev--) {

                // option 1: not take
                int notTake = dp[ind + 1][prev + 1];

                // option 2: take
                int take = 0;
                if (prev == -1 || nums[ind] > nums[prev]) {
                    take = 1 + dp[ind + 1][ind + 1];
                }

                dp[ind][prev + 1] = Math.max(take, notTake);
            }
        }

        return dp[0][0]; // corresponds to helper(0, -1)
    }
}