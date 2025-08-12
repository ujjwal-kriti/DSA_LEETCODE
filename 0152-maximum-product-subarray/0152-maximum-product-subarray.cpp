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
    }
};