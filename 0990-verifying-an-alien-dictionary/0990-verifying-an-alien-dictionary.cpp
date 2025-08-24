class Solution {
public:
    bool isAlienSorted(vector<string>& words, string order) {
        int rank[26];
        for(int i=0;i<26;i++){
            rank[order[i]-'a']=i;
        }
        for(int i=0;i<words.size()-1;i++){
            string  w1=words[i];
            string  w2=words[i+1];

            int n=min(w1.size(), w2.size());
            bool difffound=false;

            for(int j=0;j<n;j++){
                if(w1[j] !=w2[j]){
                    if(rank[w1[j] -'a'] > rank[w2[j] - 'a']){
                        return false;
                    }
                    difffound=true;
                    break;
                }
            }
            if(!difffound && w1.size()>w2.size()){
                return false;
            }
        }
        return true;
    }
};