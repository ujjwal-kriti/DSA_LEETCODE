class Solution {
    public int[][] merge(int[][] intervals) {
        
        // first sorting the array
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

        /*
    
         Step-by-step logic:
        1️  Sort all intervals by their start value.
            - Sorting helps us easily detect overlapping intervals in one pass.
            - Example after sorting: [[1,3],[2,6],[8,10],[15,18]]

        2️ Initialize 'start' and 'end' with the first interval.
            - start = intervals[0][0]
            - end = intervals[0][1]

        3️ Traverse remaining intervals:
            - If current interval overlaps with previous one (intervals[i][0] <= end):
                  → merge them by extending end = max(end, intervals[i][1])
            - Else (no overlap):
                  → store the previous merged interval [start, end]
                  → start new merge with current interval’s start and end

        4️  After loop, add the last merged interval to the list.

        5️ Convert List<int[]> → int[][] because LeetCode expects array output.

         Overlap rule:
            Two intervals [a,b] and [c,d] overlap if c <= b.
            When they overlap, new merged interval = [a, max(b,d)].

         Why List<int[]>:
            Because number of merged intervals is not known initially.
            After merging, we convert it into a fixed 2D array.
        */