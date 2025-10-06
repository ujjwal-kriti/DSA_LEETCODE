class Solution {
    public int[] twoSum(int[] nums, int target) {

        // -------------- brute force approach--------------- 
        // in java we are returning using return new int[] {i+1, j+1}

        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         if(nums[i]+nums[j]==target){
        //             return new int [] {i+1,j+1};
        //         }
        //     }
        // }
        // return new int []{} ;


        // ---------------------optimal approach ----------------------

            int right=nums.length-1, left=0;
            while(left<right){
                if(nums[right]+nums[left]==target){
                    return new  int [] {left+1,right+1};
                }else if( nums[left]+nums[right]<target){
                    left++;
                         
                }else{
                    right--;
                  
                }
            }
               return new  int [] {left+1,right+1};
    }
}