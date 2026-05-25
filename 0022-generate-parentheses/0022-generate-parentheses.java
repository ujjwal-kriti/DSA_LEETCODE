
class Solution {
    public List<String> generateParenthesis(int n) {
     List<String> result=new ArrayList<>();
    backtrack(result,"",0,0,n);
    return result;
    }
    void backtrack(List<String>result,String current,int opencount,int closecount,int n){
        if(current.length()==2*n){
            result.add(current);
            return;
        }
        if(opencount<n){
            backtrack(result,current+ "(",opencount+1,closecount,n);
        }
        if(closecount<opencount){
            backtrack(result,current+")", opencount,closecount+1,n);
        }
    }
}