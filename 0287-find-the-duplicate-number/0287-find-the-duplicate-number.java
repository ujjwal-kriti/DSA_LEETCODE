class Solution {
    public int findDuplicate(int[] nums) {
        // -----------using hash ----------------
        // HashSet<Integer>set=new HashSet<>();
        // for(int num:nums){
        //     if(set.contains(num)){
        //         return num;
        //     }
        //     set.add(num);
        // }
        // return -1;

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
            if(map.get(num)>1){
                return num;
            }
        }
        return -1;

    }
}