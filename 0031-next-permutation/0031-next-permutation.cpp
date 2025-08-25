class Solution {
public:
    void nextPermutation(vector<int>& nums) {
        // brrute force approach is using recursion 
        // we will find all permurtaion a at the same time and find lexicography next pemutatin

        //********optimal aproach is *** ***
        // using merge sort step 1: find pivot 
        // step 2: rightmost elmnt ko khojna h jo piviot se bada ho or use swap kr dnge
        // step 3: we are going to reverse the decraesing order elmnt in to increasing order

        int pivot=-1,n=nums.size();

        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                pivot=i;
                break;
            }
        }
        if(pivot==-1){
            reverse(nums.begin(),nums.end());//in place  changes without extra spaces
            return;
        }
        // next larger elmnt
        for(int i=n-1;i>pivot;i--){
            if(nums[i]>nums[pivot]){
                swap(nums[i],nums[pivot]);
                break;
            }
        }
        int i=pivot+1,j=n-1;
        while(i<=j){
            swap(nums[i++],nums[j--]);
        }
    }
};