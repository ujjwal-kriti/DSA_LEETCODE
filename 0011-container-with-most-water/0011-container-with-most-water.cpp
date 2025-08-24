class Solution {
public:
    int maxArea(vector<int>& height) {
        // int n=height.size();
        // int maxweight=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
                
        //         int wt=j-i;
        //         int  ht=min(height[i],height[j]);
        //         int current_wt=wt*ht;
        //         maxweight=max(current_wt,maxweight);
        //     }
        // }
        // return maxweight;
        // ####################################two pointer###################
       int  maxwt=0;
        int n=height.size();
        int left=0,right=n-1;
        while(left<right){
            int wt=right-left;
            int ht=min(height[left],height[right]);
            int currentwt=wt*ht;
            maxwt=max(currentwt,maxwt);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxwt;
    }
};