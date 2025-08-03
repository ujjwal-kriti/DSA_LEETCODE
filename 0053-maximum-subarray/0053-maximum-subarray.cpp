class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        // int maxsum=nums[0];
         int n=nums.size();
        // for(int start=0;start<n;start++){
        //     int sum=0;
        //     for(int end=start;end<n;end++){
        //         sum+=nums[end];
        //           maxsum=max(sum,maxsum);
        //     }
          
        // }
        // return maxsum;

        int sum=0;
        int maxsum=INT_MIN;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>maxsum)
            maxsum=sum;
        
        if(sum<0)
        sum=0;
        }
        return maxsum;
    }
};