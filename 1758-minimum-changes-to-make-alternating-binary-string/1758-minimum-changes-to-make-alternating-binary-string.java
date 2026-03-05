class Solution {
    public int minOperations(String s) {
        
        int pattern1 = 0; // start with 0 -> 0101
        int pattern2 = 0; // start with 1 -> 1010
        
        for(int i = 0; i < s.length(); i++){
            
            char c = s.charAt(i);
            
            // pattern1: even=0, odd=1
            if(i % 2 == 0){
                if(c != '0') pattern1++;
                if(c != '1') pattern2++;
            } 
            else{
                if(c != '1') pattern1++;
                if(c != '0') pattern2++;
            }
        }
        
        return Math.min(pattern1, pattern2);
    }
}