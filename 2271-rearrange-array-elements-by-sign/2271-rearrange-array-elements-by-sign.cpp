class Solution {
public:
    vector<int> rearrangeArray(vector<int>& a) {
        
        // brute force approach

        // vector<int>pos;
        // vector<int>neg;
        // int n=a.size();
        // for(int i=0;i<n;i++ ){
        //     if(a[i]>0) pos.push_back(a[i]);
        //     else  neg.push_back(a[i]);
        // }
        // for(int i=0;i<n/2;i++){
        //    a[2*i]= pos[i];
        //    a[2*i+1]=neg[i];
        // }
        // return a;

        // ***************optimal approach***********
        int n=a.size();
        vector <int>ans(n,0);
        int pos_index=0;
        int neg_index=1;
        for(int i=0;i<n;i++){
            if(a[i]>0){
                ans[pos_index]=a[i];
                pos_index+=2;
            }else{
                ans[neg_index]=a[i];
                neg_index+=2;
            }
        }
        return ans;
        
    }
};