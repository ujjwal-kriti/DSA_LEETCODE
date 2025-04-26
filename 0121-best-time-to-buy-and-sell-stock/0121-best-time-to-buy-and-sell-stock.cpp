class Solution {
public:
    int maxProfit(vector<int>& prices) {
        // int maxpro=0;
        // for(int i=0;i<prices.size();i++){
        //     for(int j=i+1;j<prices.size();j++){
        //         if(prices[j]>prices[i]){
        //             maxpro=max(prices[j]-prices[i],maxpro);
        //         }
        //     }
        // }
       
        // return maxpro;

        int minprice=INT_MAX;
        int maxprofit=0;
        for(int price:prices){
            minprice=min(minprice,price);
            maxprofit=max(maxprofit,price-minprice);
        }
        return maxprofit;
    }
    
};