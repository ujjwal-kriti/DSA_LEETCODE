class Solution {
public:
    // bool isPalindrome(int x) {
    //     if(x<0)return false;
    //     long rev=0;
    //     long orig=x;
    //   while(x!=0){
     
    
    //    long num =x%10;
    //     rev=rev*10+num;
    //     x/=10;
    // }
    // return rev==orig;

    bool isPalindrome(int x){
        if(x<0) return false;
         long rev=0;
         long orig=x;
         while(x!=0){
           long  num=x%10;
            rev=rev*10+num;
            x=x/10;
        }
        return rev==orig;
    }
};