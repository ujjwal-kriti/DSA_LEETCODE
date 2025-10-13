class Solution {
    public int longestConsecutive(int[] nums) {
            int n = nums.length;
        if (n == 0) return 0;

        Arrays.sort(nums);

        int longest = 1;
        int current = 1;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                continue; // skip duplicates
            } else if (nums[i] == nums[i - 1] + 1) {
                current++; // continue streak
            } else {
                longest = Math.max(longest, current);
                current = 1; // reset streak
            }
            
        }
  return Math.max(longest, current);
       
    }
}  