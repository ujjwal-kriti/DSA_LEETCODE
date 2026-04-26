class Solution {

    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long total = 0;

        // Loop for all subarrays
        for (int i = 0; i < n; i++) {

            int min = nums[i];
            int max = nums[i];

            for (int j = i; j < n; j++) {

                // Update min and max
                if (nums[j] < min) {
                    min = nums[j];
                }
                if (nums[j] > max) {
                    max = nums[j];
                }

                // Add range
                total += (max - min);
            }
        }

        return total;
    }
}