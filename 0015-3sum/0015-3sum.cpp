class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
    //     int n=nums.size();
    //    set<vector<int>>s;
    //     sort(nums.begin(),nums.end());
    //     for(int i=0;i<n;i++){
    //         for(int j=i+1;j<n;j++){
    //             for(int k=j+1;k<n;k++){
    //                if( nums[i]+nums[j]+nums[k]==0){
    //                 s.insert({nums[i],nums[j],nums[k]});
    //                }
    //             }
    //         }
    //     }
    //    return vector<vector<int>>(s.begin(), s.end()); time limit exceded


    // use two pointer approach ********************************************************888
        vector<vector<int>> ans;
        int n=nums.size();
        sort(nums.begin(), nums.end()); 
        for(int i=0;i<n;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int j=i+1,k=n-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum>0){
                    k--;
                }else if(sum<0){
                    j++;
                }
                else{
                    ans.push_back({nums[i],nums[j],nums[k]});
                    j++,k--;
                    while(j<k &&  nums[j]==nums[j-1]) j++;
                }
            }
        }
        return ans;
    }
};