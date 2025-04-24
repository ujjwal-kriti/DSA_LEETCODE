class Solution {
public:
    int missingNumber(vector<int>& num) {
        int n = num.size();
        int total=(n*(n+1))/2;
        int sum=0;
        for(int i=0;i< num.size();i++){
            sum+=num[i];
        }
        return total-sum;
    }
};