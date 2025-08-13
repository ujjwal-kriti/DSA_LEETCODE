class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        // int n=nums.size();
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]+nums[j]==target){
        //             return {i+1,j+1};
        //         }
        //     }
        // }
        // return {};


        //usng two pointer approach
        int n=nums.size();
        int start=0,end=n-1;
        while(start<end){
            int sum=nums[start]+nums[end];
            if(sum==target){
                return{start+1,end+1};
            }else if(sum<target){
            start++;
            }else{
                end--;
            }
            
        }
        
        return {};
        
    }
};