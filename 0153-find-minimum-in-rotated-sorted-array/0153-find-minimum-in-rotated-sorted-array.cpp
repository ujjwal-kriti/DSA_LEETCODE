class Solution {
public:
    int findMin(vector<int>& nums) {
        // int start=0,end=nums.size()-1,ans=nums[0];
        // while(start<=end){
        //     int mid=start+(end-start)/2;
        //     //left side sorted array
        //     if(nums[mid]>=nums[0])
        //     start=mid+1;
        //     else{
        //         ans=nums[mid];
        //         end=mid-1;
        //     }
        // }
        // return ans;

        int left=0;
        int n=nums.size();
        int right=n-1;
        int ans=nums[0];
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=nums[0]){
                left=mid+1;
            }else{
                ans=nums[mid];
                right=mid-1;
            }
        }
        return ans;
    }
};