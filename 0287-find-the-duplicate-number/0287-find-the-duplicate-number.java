class Solution {
    public int findDuplicate(int[] nums) {

        // -----------------------this is a brute force approach like time limit exceedded 
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]){
        //             return nums[i];
        //         }
        //     }
        // }
        // return n ;


        //------------using count method ---------

        // int n=nums.length;
        // int [] count=new int [n+1];
        // for(int i=0;i<n;i++){
        //     count[nums[i]]++;
        //     if(count[nums[i]]>1){
        //         return nums[i];
        //     }
        // }

        // return n;

        // -----------using hash ----------------
        // here set is used  because we want to store unique number 

        Set<Integer>set=new HashSet<>();
        int len=nums.length;
        for(int i=0;i<len;i++){
        if(!set.add (nums[i])){
            return nums[i];
        }
        }
        return len;
        

    }
}