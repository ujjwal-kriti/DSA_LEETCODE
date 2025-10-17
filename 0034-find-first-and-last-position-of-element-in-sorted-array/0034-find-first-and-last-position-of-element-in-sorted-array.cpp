class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        // int first=-1,last=-1;
        // int n=nums.size();
        // for(int i=0;i<n;i++){
        //     if(nums[i]==target){
        //         first = i;
        //         break;
        //     }
        // }

        // for(int j=n-1;j>=0;j--){
        //     if(nums[j]==target){
        //         last = j;
        //         break;
        //     }
        // }
        //  return{first,last};

        int n=nums.size();
        int left = 0,right = n-1, first = -1,last=-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(nums[mid]==target){
                first=mid;
                right=mid-1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        left=0,right=n-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            // last occurance
            if(nums[mid]==target){
                last=mid;
                left=mid+1;
            }else if(nums[mid]<target){
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
         return{first,last};
    } 
};