class Solution {
    public int maxJump(int[] stones) {
        
        if(stones.length==0)return 0;
        int max=0;
        for(int i=1;i<stones.length;i++){
        int left=Math.abs(stones[i]-stones[i-1]);
        max=Math.max(max,left);
            if(i>1){
                int right=Math.abs(stones[i]-stones[i-2]);
                max=Math.max(max,right);
                
            }
        }
        return max;

    }
}