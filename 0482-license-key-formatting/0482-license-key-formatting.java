class Solution {
    public String licenseKeyFormatting(String s, int k) {
        s=s.replace("-","").toUpperCase();
        StringBuilder res=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            res.append(s.charAt(i));
            count++;
            if(count==k){
                res.append("-");
                count=0;
            }
        }
        res.reverse();
        if(res.length()>0 && res.charAt(0)=='-'){
            res.deleteCharAt(0);
        }
        return res.toString();
    }
}