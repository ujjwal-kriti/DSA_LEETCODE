class Solution {
public:
    int secondHighest(string s) {
        int n=s.size();
        if(n<2) return -1;
        int max=-1;
        int secondmax=-1;
        for(int i=0;i<n;i++){
            if(isdigit(s[i])){
                int digit=(s[i]-'0');{
                    if(digit>max){
                        secondmax=max;
                        max=digit;
                    }
                    else if(digit<max && digit>secondmax){
                        secondmax=digit;
                    }
                }
            }
        }
        
        return secondmax;
    }
};