class Solution {
    public int longestPalindrome(String s) {
        int[] freq=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        int length=0;
        boolean hasodd=false;
        for(int count:freq){
            if(count%2==0){
                length+=count;
            }else{
                length+=count-1;
                hasodd=true;
            }
        }
            if(hasodd){
                length+=1;
            }
        
        return length;
    }
}