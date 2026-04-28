class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int left=0;
        int right=0;
        int  maxsum=Integer.MIN_VALUE;
        while(right<nums.length){
            sum+=nums[right];
            if(right-left+1==k){
                
                maxsum=Math.max(maxsum,sum);
             sum-=nums[left];
                left++;
            }
            right++;
        }
    return (double)maxsum/k;
    }
}