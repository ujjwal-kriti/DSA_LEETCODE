    class Solution {
        public int maxTurbulenceSize(int[] arr) {
            int n=arr.length;
            int maxlen=1;
            int start=0;
            if(n==1) return 1;
            for(int i=1;i<n;i++){
                if(arr[i]==arr[i-1]){
                    start=i;
                }else if(i>=2 && ((arr[i-2]>arr[i-1] &&arr[i-1]>arr[i])||(arr[i-2]<arr[i-1] &&arr[i-1]<arr[i]))) {
                    start=i-1;
                }
                maxlen=Math.max(maxlen,i-start+1);
            }
            return maxlen;
        }
    }