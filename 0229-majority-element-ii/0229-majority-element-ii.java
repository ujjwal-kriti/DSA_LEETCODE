class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n=nums.length;
          List<Integer> result = new ArrayList<>();
     
        for(int val:nums){
            int freq=0;
            for(int el:nums){
                if(el==val)
                freq++;
            }
        
        if(freq>n/3 && !result.contains(val)){
            result.add(val);
        }
        }
        return result;
    }
}