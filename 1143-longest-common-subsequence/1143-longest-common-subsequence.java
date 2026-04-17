class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int n=text1.length();
        int m=text2.length();
        int[][] dp=new int [n+1][m+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(text1.charAt(i)==text2.charAt(j)){
                    if(i>0 && j>0){
                        dp[i][j]=1+dp[i-1][j-1];
                    }else{
                        dp[i][j]=1;
                    }
                }else{
                    int up=(i>0) ?dp[i-1][j]:0;//skip text1
                    int left=(j>0)?dp[i][j-1]:0;//skip text2
                    dp[i][j]=Math.max(up,left);
                }
            }
        }
        return dp[n-1][m-1];
    }
}