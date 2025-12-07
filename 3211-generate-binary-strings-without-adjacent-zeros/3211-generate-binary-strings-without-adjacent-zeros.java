class Solution {
    public List<String> validStrings(int n) {
        List<String>result=new ArrayList<>();
        generate(n,"", result);
        return result;
    }
    static void generate(int n, String current,List<String>result){
        //base case
        if(current.length()==n){
            result.add(current);
            return ;
        }

        //add 1
        generate(n,current+"1", result);
        //OPTION 2: Add '0' only if last char is NOT '0'
        if(current.length()==0|| current.charAt(current.length()-1)!='0'){
            generate(n,current+'0',result);
        }
    }
}