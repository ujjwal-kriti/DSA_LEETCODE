class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character>maps=new  HashMap<>();
        HashMap<Character,Character>mapt=new  HashMap<>();
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(maps.containsKey(c1)){
                if(maps.get(c1)!=c2) return false;
            }else{
                    maps.put(c1,c2);;
            }
            if(mapt.containsKey(c2)){
                if(mapt.get(c2)!=c1) return false;
            }else{
                mapt.put(c2,c1);
            }

        }
        return true;

    }
}