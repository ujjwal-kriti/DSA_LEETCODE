class Solution {
    public String sortSentence(String s) {
        String[] words=s.split(" ");
        String[] res=new String[words.length];
        for(String word : words){
            int n=word.length();
            int pos=word.charAt(n-1)-'0';
            String actualword=word.substring(0,n-1);
            res[pos-1]=actualword;
        }
        return String.join(" " , res);
    }
}