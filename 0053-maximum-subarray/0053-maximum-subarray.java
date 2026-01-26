class Solution {
    public int maxSubArray(int[] nums) {
        //kadanes algorithm
        int sum=0;
        int max_sum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max_sum){
                max_sum=sum;
            }
            //If your current sum becomes negative, it will only reduce the sum of any future subarray
            if(sum<0){
                sum=0;
            }
        }
        return max_sum;
    }
}