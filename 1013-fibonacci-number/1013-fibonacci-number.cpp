class Solution {
public:
    int fib(int n) {
       if(n==0)return 0;
       if(n==1)return 1;
       int a=0;
       int b=1;
       int result;
       for(int i=2;i<=n;i++){
         result=a+b;
        a=b;
        b=result;
       }
       return result;
    }
};