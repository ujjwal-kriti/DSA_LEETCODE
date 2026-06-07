class Solution {
    public void sortColors(int[] nums) {
    int count0=0;
    int count1=0;
    int count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)count0++;
            else if(nums[i]==1)count1++;
            else count2++;
        }
        int idx=0;
        for(int i=0;i<count0;i++){
            nums[idx]=0;
            idx++;
        }
       for(int i=0;i<count1;i++){
            nums[idx]=1;
            idx++;
        }
         for(int i=0;i<count2;i++){
            nums[idx]=2;
            idx++;
        }
    }
}
//Dutch National Flag Algorithm) u can use for better approach
