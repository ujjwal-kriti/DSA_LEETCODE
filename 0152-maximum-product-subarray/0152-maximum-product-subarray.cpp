class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n=nums.size();
        int maxp=INT_MIN;;
        for(int start=0;start<n;start++){
            int product=1;
            for(int end=start;end<n;end++){
                product*=nums[end];
                  maxp=max(product,maxp);
            }
           
        }
        return maxp;

        // using kadane's algorithm

        // int maxp=nums[0];
        // int curr_max=nums[0];
        // int curr_min=nums[0];
        // for(int i=1;i<n;i++){
        //     if
            
        // }

    }
};