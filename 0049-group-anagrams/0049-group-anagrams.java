class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>dep=new HashMap<>();
        for(String word:strs){
            char[] chars=word.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
        
        dep.putIfAbsent(key, new ArrayList<>());
        dep.get(key).add(word);
        }
        return new ArrayList<>(dep.values());
    }
}