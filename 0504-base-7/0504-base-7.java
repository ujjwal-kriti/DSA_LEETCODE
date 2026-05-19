class Solution {
    public String convertToBase7(int num) {
        if(num==0) return "0";
        int n=Math.abs(num);
        StringBuilder sb=new StringBuilder();
        while(n>0){
            int rem=n%7;
            sb.append(rem);
            n/=7;
        }
        sb.reverse();
        if(num<0){
            sb.insert(0,"-");
        }
        return sb.toString();
    }
}