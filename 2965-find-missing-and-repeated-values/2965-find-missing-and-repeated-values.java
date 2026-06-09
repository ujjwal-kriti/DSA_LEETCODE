class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n=grid.length;
        int miss=0;
        int repeat=0;
        int[] freq=new int[n*n+1];
         for(int[] row : grid){
            for(int num : row){
                freq[num]++;
            }
        }
        for(int i=0;i<=n*n;i++){
        
            if(freq[i]==2)repeat=i;
            if(freq[i]==0) miss=i;
        }
        return new int[]{repeat,miss};
    }
}