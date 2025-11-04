class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] mapST=new int[256];
        int[] mapTS=new int[256];

        Arrays.fill(mapST, -1);
        Arrays.fill(mapTS,-1);
        for(int i=0;i<s.length();i++){
            char cs=s.charAt(i);
            char ct=t.charAt(i);
            if(mapST[cs]==-1 && mapTS[ct]==-1){
                mapST[cs]=ct;
                mapTS[ct]=cs;

            }else {
                if(mapST[cs]!=ct || mapTS[ct]!=cs){
                return false;
                }
            }
        }
        return true;
    }
}