class Solution {
public:
    int myAtoi(string s) {
        int sign=1;
        int i=0;
        int num=0;
        int n=s.length();
        while(i<n && s[i]==' ')i++;
            if(i<n && (s[i]=='+'|| s[i]=='-')){
            if(s[i]=='-') sign=-1;
            i++;
            }
            // convert digits to number
            while(i<n && isdigit(s[i])){
                int digit=s[i]-'0';

                // handle overflow int max==2147833647  
// number ko return krne se phle chck kr rhe h ki num agr max se bada h to yhi pr retunr kr dnge 
                if(num>INT_MAX/10||(num==INT_MAX/10 && digit>7)){
                    return (sign==1)?INT_MAX:INT_MIN;
                }
                num=num*10+digit;
                i++;
            }
        return num*sign;
    }
};