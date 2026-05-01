class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length == 0) return 0;
        int n = matrix[0].length;
        int[] height = new int[n];
        int[] left = new int[n];
        int[] right = new int[n];
        for(int i = 0; i < n; i++) right[i] = n;
        int maxArea = 0;
        for(int i = 0; i < matrix.length; i++) {
            int curLeft = 0, curRight = n;
            // 1 update height
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '1')
                    height[j]++;    
                else
                    height[j] = 0;
            }
            // update left
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == '1')
                    left[j] = Math.max(left[j], curLeft);
                else {
                    left[j] = 0;
                    curLeft = j + 1;
                }
            }
            // update right
            for(int j = n - 1; j >= 0; j--) {
                if(matrix[i][j] == '1')
                    right[j] = Math.min(right[j], curRight);
                else {
                    right[j] = n;
                    curRight = j;
                }
            }
            // calculate area
            for(int j = 0; j < n; j++) {
                maxArea = Math.max(maxArea, height[j] * (right[j] - left[j]));
            }
        }
        return maxArea;
    }
}