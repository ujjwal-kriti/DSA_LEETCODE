class Solution {
    public boolean isPalindrome(String s) {
          String cleaned="";
          for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                cleaned+=Character.toLowerCase(c);
            }
          }
        int left=0,right=cleaned.length()-1;
        while(left<right){
            if(cleaned.charAt(left)!=cleaned.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}