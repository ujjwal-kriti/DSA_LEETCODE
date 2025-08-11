class Solution {
public:
    bool containsNearbyDuplicate(vector<int>& nums, int k) {
        
        // time limit excedded
        // int n=nums.size();
        
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j] && abs(i-j)<=k)
        //         { 
        //                 return true;
        //         }
        //     }
        // }
        // return false;


        unordered_map<int,int> lastindex;
        for(int i=0;i<nums.size();i++){
            if(lastindex.count(nums[i])){
                if(i-lastindex[nums[i]]<=k){
                    return true;
                }
            }
            lastindex[nums[i]]=i;
        }
        return false;
    }
};