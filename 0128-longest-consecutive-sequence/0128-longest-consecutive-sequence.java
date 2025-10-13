class Solution {
    public int longestConsecutive(int[] nums) {
        // ------------------------------brute force------------
           // int n = nums.length;
//         if (n == 0) return 0;

//         Arrays.sort(nums);

//         int longest = 1;
//         int current = 1;

//         for (int i = 1; i < n; i++) {
//             if (nums[i] == nums[i - 1]) {
//                 continue; // skip duplicates
//             } else if (nums[i] == nums[i - 1] + 1) {
//                 current++; // continue streak
//             } else {
//                 longest = Math.max(longest, current);
//                 current = 1; // reset streak
//             }
            
//         }
//   return Math.max(longest, current);

    //-------------------------hash-------------------
       HashSet<Integer>set=new HashSet<>();
       int longest=0;
       for(int num:nums){
        set.add(num);
       }
       for(int num:set){
       if(!set.contains(num-1)){
        int currentnum=num;
        int streak=1;
        while(set.contains(currentnum+1)){
            currentnum++;
            streak++;
        }
        longest=Math.max(streak,longest);
       }
       }
       return longest;
    }
}  