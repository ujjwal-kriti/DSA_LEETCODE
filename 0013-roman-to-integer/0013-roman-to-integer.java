class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer>ujjwal=new HashMap<>();
        ujjwal.put('I',1);
        ujjwal.put('V',5);
        ujjwal.put('X',10);
        ujjwal.put('L',50);
        ujjwal.put('C',100);
        ujjwal.put('D',500);
        ujjwal.put('M',1000);

        int total=0;
        for(int i=0;i<s.length();i++){
            int current=ujjwal.get(s.charAt(i));

            // check next symbol exist or not
            if(i+1<s.length() && current<ujjwal.get(s.charAt(i+1))){
                total-=current;
            }else{
                total+=current;
            }
        }
        return total;
    }
}