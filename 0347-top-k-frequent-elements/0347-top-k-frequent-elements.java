class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     HashMap<Integer,Integer>map=new HashMap<>();
     for(int num:nums){
        map.put(num,map.getOrDefault(num,0)+1);
     }
     //maxheap
       PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> {
            return map.get(b) - map.get(a);
        });
        pq.addAll(map.keySet());
        int[] ans=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=pq.poll();
        }
        return ans;
     

    }
}

