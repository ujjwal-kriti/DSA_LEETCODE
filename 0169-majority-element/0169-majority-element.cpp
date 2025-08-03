class Solution {
public:
    int majorityElement(vector<int>& nums) {
        // int n=nums.size();
        // for(int val:nums){
        //     int freq=0;
        //     for(int elm:nums){
        //         if(elm==val)
        //         freq++;
        //     }
        //     if(freq>(n/2))
        //     return val;
        // }
        // return -1;

        //********************************tc(o(logn))************************
        // int n=nums.size();
        // int freq=1,ans=nums[0];
        // sort(nums.begin(),nums.end());
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;i<n;i++){
        //         if(nums[i]==nums[j-1]){
        //             freq++;
        //         }else{
        //             freq=1,ans=nums[i];
        //         }
        //     }
         
        // }
        //    if(freq>(n/2))
        //     return nums[i];

        sort(nums.begin(), nums.end());
        return nums[nums.size() / 2];
    }
};
    
