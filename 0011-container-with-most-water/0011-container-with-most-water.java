class Solution {
    public int maxArea(int[] height) {

        // -------------------------brute force approach time limit exceded--------------

        // int n=height.length;
        // int max_water=0;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int wt=j-i;
        //         int ht=Math.min(height[i],height[j]);
        //         int curr_water=wt*ht;
        //         max_water=Math.max(curr_water,max_water);
        //     }
        // }
        // return max_water;


        //-------------------two pointer approahc----------------
        int n=height.length;
        int left=0,right=n-1;
          int max_water=0;

        while(left<right){
            int wt=right-left;
            int ht=Math.min(height[left],height[right]);
            int width=wt*ht;
            max_water=Math.max(max_water,width);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return max_water;

    }
}