class Solution {
    public int countPartitions(int[] nums) {
        int count=0;
        int totalsum=0;;
        for (int num:nums){
            totalsum+=num;
        }
        if(totalsum%2==0){
            return nums.length-1;
        }
        return 0;
    }
}