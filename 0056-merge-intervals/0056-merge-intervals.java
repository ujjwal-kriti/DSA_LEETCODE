class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b) -> a[0] - b[0]);

        List<int []> merged=new ArrayList<>();

        int start= intervals[0][0];
        int end=intervals[0][1];
        int n=intervals.length;
        for(int i=1;i<n;i++){
            if (intervals[i][0]<=end){
                // overlap
                end=Math.max(intervals[i][1], end);
            }else{
                // no overlap
                merged.add(new int[]{start,end});
                start=intervals[i][0];
                 end=intervals[i][1];
            }

        }
        merged.add(new int[]{start,end});
        return  merged.toArray(new int [merged.size()][]);
    }
}