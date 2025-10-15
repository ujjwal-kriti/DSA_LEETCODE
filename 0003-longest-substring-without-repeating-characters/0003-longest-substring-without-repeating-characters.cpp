class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        // brute force
        // int n=s.size();
        // int ans=0;
        // for(int i=0;i<n;i++){
        //    unordered_set<char>seen;
        //    for(int j=i;j<n;j++){
        //     if(seen.count(s[j]))break;
        //     seen.insert(s[j]);
        //     ans=max(ans,j-i+1);
        //    }
        // }
        // return ans;

        //---------------------hashtable----------

        int  n=s.size();
        int ans=0;
        int start=0;
        unordered_set<int>ujjwal;
        for(int end=0;end<n;end++){
            while(ujjwal.count(s[end])){
                ujjwal.erase(s[start]);
                start++;
            }
            ujjwal.insert(s[end]);
            ans=max(ans,end-start+1);
        }
      return ans;
        
    }
};