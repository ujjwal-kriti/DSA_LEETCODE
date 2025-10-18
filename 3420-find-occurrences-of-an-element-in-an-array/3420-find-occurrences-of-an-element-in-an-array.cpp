class Solution {
public:
    vector<int> occurrencesOfElement(vector<int>& nums, vector<int>& queries, int x) {
        unordered_map<int,int>ujjwal;
        int n=nums.size();
        int m=queries.size();
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]==x){
                count++;
                ujjwal[count]=i;
            }
        }
        for(int i=0;i<m;i++){
            if(ujjwal.find(queries[i]) !=ujjwal.end()){
                queries[i]=ujjwal[queries[i]];
            }else{
                queries[i]=-1;
            }
        }
      return queries;
    }
};