class Solution {
    public String[] findWords(String[] words) {
        String r1="qwertyuiop";
        String r2="asdfghjkl";
        String r3="zxcvbnm";
        List<String>res=new ArrayList<>();
        for(String word:words){
         String s=word.toLowerCase();
         String row="";
         if(r1.indexOf(s.charAt(0))!=-1){
            row=r1;
         }
         else if(r2.indexOf(s.charAt(0)) !=-1){
            row=r2;
         }else{
            row=r3;
         }
         boolean sameRow=true;
         for(char ch:s.toCharArray()){
            if(row.indexOf(ch)==-1){
                sameRow=false;
                break;
            }
            
         }
         if(sameRow){
            res.add(word);
         }
       
    }
      return res.toArray(new String[0]);
    }
}