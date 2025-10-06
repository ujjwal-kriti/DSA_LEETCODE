class Solution {
    public int maxProduct(int[] nums) {
        // brute force approach 

        // int maxp=Integer.MIN_VALUE;
        // for(int i=0;i<nums.length;i++){
        //     int product=1;
        //     for(int j=i;j<nums.length;j++){
        //         product*=nums[j];
        //         maxp=Math.max(product,maxp);
        //     }
        // }
        // return maxp;


        // optimal approach using kadanes algorithm

        
        int maxprod=nums[0];
        int minprod=nums[0];
        int ans=nums[0];

        for(int i=1;i<nums.length;i++){
            int currprod=nums[i];
    
        if(currprod<0){
            int temp=maxprod;
            maxprod=minprod;
            minprod=temp;
        }
        maxprod=Math.max(maxprod*currprod,currprod);
        minprod=Math.min(minprod*currprod,currprod);

        ans=Math.max(ans,maxprod);
        }
return ans;
    }
}