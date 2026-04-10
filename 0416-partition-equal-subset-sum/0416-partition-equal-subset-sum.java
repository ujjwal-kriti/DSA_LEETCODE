class Solution {
    public boolean canPartition(int[] nums) {
    //     int sum=0;
    //     for(int num:nums){
    //         sum += num;
    //     }
    //     if(sum%2!=0) return false;
    //     int target=sum/2;
    //     return helper(nums,0,0,target);
    // }
    // public static boolean helper(int nums[],int index,int currsum,int target){
    //     if(currsum==target) return true;
    //     if(index >= nums.length|| currsum>target) return false;
    //     boolean include=helper(nums,index+1,currsum+nums[index],target);
    //     boolean exclude=helper(nums,index+1,currsum,target);
    //     return include||exclude;
    // }

        //---------------------using tabulaiton--------------------
            int sum=0;
        for(int num:nums){
                sum += num;
            }
         if(sum%2!=0) return false;
         int target=sum/2;
         boolean[] dp=new boolean[target+1];
         dp[0]=true;
         for(int num:nums){
            for (int j = target; j >= num; j--) {
                dp[j] = dp[j] || dp[j - num];
            }
         }
        return dp[target];
    }
}