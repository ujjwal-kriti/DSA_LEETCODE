class Solution {
    //--------------------------------using recursion (tc0(2^n))-------------------
    // public int rob(int[] nums) {
    //    return helper(nums,0);
    // }
    // public int helper(int nums[],int i){
    //      if(i>=nums.length)return 0;
    //     int peak=nums[i]+helper(nums,i+2);
    //     int not_peak=helper(nums,i+1);
    //     return Math.max(peak,not_peak);
    // }
//-------------------------------0(n) apply memoization--------------
    public int rob(int[] nums) {
       int dp[]=new int[nums.length];
       for(int i=0;i<nums.length;i++){
        dp[i]=-1;
       }
       return helper(nums,0,dp);
    }
    public int helper(int nums[],int i,int dp[]){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
         int peak = nums[i] + helper(nums,i+2,dp);
        int not_peak = helper(nums,i+1,dp);
        dp[i] = Math.max(peak,not_peak);
        return dp[i];
    }
}