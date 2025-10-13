class Solution {
    public List<Integer> majorityElement(int[] nums) {

        // -----------------brute force--------------

        // int n=nums.length;
        //   List<Integer> result = new ArrayList<>();
     
        // for(int val:nums){
        //     int freq=0;
        //     for(int el:nums){
        //         if(el==val)
        //         freq++;
        //     }
        
        // if(freq>n/3 && !result.contains(val)){
        //     result.add(val);
        // }
        // }
        // return result;

        //---------------------hashtable--------------

        int n=nums.length;
        HashMap<Integer,Integer>freq=new HashMap<>();
        List<Integer>result=new  ArrayList<>();
        // for(int val:nums){
        //     freq.put(val,freq.getOrDefault(val,0)+1);
        // }
        for(int val:nums){
        if(freq.containsKey(val)){//capital key
            freq.put(val,freq.get(val)+1);
        }else{
            freq.put(val,1);
        }
    }
        for(int key : freq.keySet()){
            if(freq.get(key)>n/3){
                result.add(key);
            }
        }
        return result;
    }
}