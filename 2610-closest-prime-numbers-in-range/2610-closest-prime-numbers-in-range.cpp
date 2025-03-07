class Solution {
public:
    vector<int> closestPrimes(int left, int right) {
        const int MAX_N=1e6;
        vector<bool> isprime(MAX_N+1,true);
        vector<int> prime_num;
        isprime[0]= isprime[1]=false;
        for(int i=2;i*i<=MAX_N;i++){
            if(isprime[i]){
                for(int j=i*i;j<=MAX_N;j+=i){
                    isprime[j]=false;
                }
            }
        }
        for(int i=max(2,left);i<=right;i++){
            if(isprime[i]){
                prime_num.push_back(i);
            }
        }
        if(prime_num.size()<2)return{-1,-1};
        int minDiff = INT_MAX;
        vector<int> ans(2,-1);
        for(int i=1;i<prime_num.size();i++){
            int diff=prime_num[i]-prime_num[i-1];
            if(diff<minDiff){
                minDiff=diff;
                ans={prime_num[i-1],prime_num[i]};
            }
        }
        return ans;
    }
};