class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        int n = matrix.size();
 vector<vector<int>> ujjwal(n, vector<int>(n));
        for(int j = 0; j < n; j++) {
            for(int i = n - 1; i >= 0; i--) {
              ujjwal[j][n-1-i]=matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
         {
            matrix[i][j] = ujjwal[i][j];
            }
       }
    }
};
