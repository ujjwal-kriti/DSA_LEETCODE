class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
      Map<Integer,Integer>result=new HashMap<>();
        
        for(int i=0;i<n;i++){
        int res=target-nums[i];
        if(result.containsKey(res)){
            return new int []{result.get(res),i};
        }
        result.put(nums[i],i);
        }
        return new int[]{};
    }
}