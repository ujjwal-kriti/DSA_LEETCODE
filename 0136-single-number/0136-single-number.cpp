class Solution {
public:
    int singleNumber(vector<int>& nums) {
       unordered_map<int ,int>temp;
       for(int i=0;i<nums.size();i++){
        temp[nums[i]]++;
       }
        for(auto i:temp){
            if(i.second<=1){
                return i.first;
            }
        }
        return -1;
    }
};