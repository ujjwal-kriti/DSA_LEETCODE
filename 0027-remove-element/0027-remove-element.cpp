class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int j = 0;  // pointer for placing non-val elements
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];  // keep the element
                j++;
            }
        }
        return j;  // number of elements not equal to val
    }
};