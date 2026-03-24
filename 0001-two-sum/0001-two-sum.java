class Solution {
    public int[] twoSum(int[] nums, int target) {
    //     int n=nums.length;
    //   Map<Integer,Integer>result=new HashMap<>();
        
    //     for(int i=0;i<n;i++){
    //     int res=target-nums[i];
    //     if(result.containsKey(res)){
    //         return new int []{result.get(res),i};
    //     }
    //     result.put(nums[i],i);
    //     }
    //     return new int[]{};

        //----------------------other method------
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((nums[i]+nums[j])==target){
                    return new int [] {i,j};
                }
            }
        }
        return new int[]{};
    }
}