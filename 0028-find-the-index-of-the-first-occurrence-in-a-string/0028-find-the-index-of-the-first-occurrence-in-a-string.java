class Solution {
    public int strStr(String haystack, String needle) {
        int n=needle.length();
        int m=haystack.length();
        
        if(n==0) return 0;
        if(n>m) return -1;

        for(int i=0;i<=m-n;i++){
                boolean match=true;
                for(int j=0;j<n;j++){
                    if(haystack.charAt(i+j)!=needle.charAt(j)){
                        match=false;
                        break;
                    }
                }
               if (match) return i;
        }
        return -1;
    }
}