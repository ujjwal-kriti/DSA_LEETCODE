class Solution {
public:
    int majorityElement(vector<int>& nums) {
    //     int n=nums.size();
    //     for(int i=0;i<n;i++){
    //          int count=0;
    //         for(int j=i;j<n;j++){
    //             if(nums[i]==nums[j]){
    //                 count++;
    //             }
    //         }
    //         if(count>(n/2))
    //         return nums[i];
    //     }
    //    return -1;

            // ******************************using hashmap better approach***********


            // int n=nums.size();
            // map<int , int>ujjwal;
            // for(int i=0;i<n;i++){
            //     ujjwal[nums[i]]++;
            // }
            // for(auto it:ujjwal){
            //     if(it.second>(n/2)){
            //         return it.first;
            //     }
            // }
            // return -1;


            // *****************************moore's voting algorithm*********************************

            // initially we will take elemnt (initialize nothing), count as 0 , now for each same elemnt count will be incremneted and differnt elmnt count will be decremenged till  0 , as 0 zero comes in count we wtill take that array and comparen/2;


            int n =nums.size();
            int el;
            int count=0;
            for(int i=0;i<n;i++){
                if(count==0){
                count=1;
                el=nums[i];
            }
            else if(nums[i]==el){
                count++;
            }
            else{
                count--;
            }
        }
            int cnt1=0;
            for(int i=0;i<n;i++){
                if(nums[i]==el) cnt1++;
            }
            if(cnt1>(n/2)){
                return el;
            }
            return -1;
    }
};

