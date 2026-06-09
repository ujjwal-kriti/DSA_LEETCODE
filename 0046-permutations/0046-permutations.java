class Solution {
static  void backtrack(int [] nums, List<Integer>current,List<List<Integer>>result){
        //add curretn subset to result
        // if(result.contains(current)){
        //     return;
        // }
       
        if (current.size() == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        //include or exclude remanig elment
        for(int num:nums){
            if(current.contains(num))
            continue;
        current.add(num);
        backtrack(nums,current,result);
        current.remove(current.size()-1);
        }
}
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>result=new ArrayList<>();
        List<Integer>current=new ArrayList<>();
        backtrack(nums,current,result); 
        return result;
    }
}