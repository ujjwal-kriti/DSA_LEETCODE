class Solution {
public:
    void rotate(vector<int>& arr, int k) {
        int n=arr.size();
        k=k%n;
        vector<int>temp(k);
        //store last k elemnt in temp
        for( int i=0;i<k;i++){
            temp[i]=arr[n-k+i];
        }
        // shift rest elments to right
        for(int i=n-1;i>=k;i--){
           arr[i]= arr[i-k];
        }
        // put temp elments in begining
        for(int i=0;i<k;i++){
            arr[i]=temp[i];
        }

    }
};