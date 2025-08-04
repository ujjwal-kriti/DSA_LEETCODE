class Solution {
public:
    vector<int> rearrangeArray(vector<int>& nums) {
        // vector<int>pos;
        // vector<int>neg;
        // for(int i=0;i<nums.size();i++){
        //     if(nums[i]>0)pos.push_back(nums[i]);
        //     else{
        //        neg. push_back(nums[i]);
        //     }

        // }
        // for(int i=0;i<nums.size()/2;i++){
        //         nums[2*i]=pos[i];
        //         nums[2*i+1]=neg[i];
        // }
        // return nums;

        //***************uisng two pointer approach
        int n=nums.size();
        vector <int>ujj(n);
        int pos=0,neg=1;
        for(int i=0;i<n;i++){
            if(nums[i]>0){
            ujj[pos]=nums[i];
            pos+=2;
            }
            else{
                ujj[neg]=nums[i];
                neg+=2;
            }
        }
        return ujj;
    }
};