class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] ans =new int [n];

        int leftsum=0;
        int rightsum=0;
        for(int num:nums){
            rightsum+=num;
        }
        for(int i=0;i<n;i++){
                rightsum-=nums[i];
                ans[i]=Math.abs(leftsum-rightsum);
                leftsum+=nums[i];
        }
        return ans;
    }
}