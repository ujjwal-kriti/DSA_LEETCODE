class Solution {
public:
    int findMaxConsecutiveOnes(vector<int>& nums) {
        int count=0,maxi=0;
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(nums[i]==1){
                count++;
            }else{
                maxi=max(maxi,count);
                count=0;
            }
            maxi=max(maxi,count);
        }
        return maxi;
    }
};