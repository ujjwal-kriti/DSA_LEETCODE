class Solution {

    public int uniqueMorseRepresentations(String[] words) {

        // Morse code table for a-z
        String[] morse = {
            ".-","-...","-.-.","-..",".","..-.","--.","....","..",".---",
            "-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
            "..-","...-",".--","-..-","-.--","--.."
        };

        // HashSet stores only unique values
        HashSet<String> set = new HashSet<>();

        // go through each word
        for (String word : words) {

            StringBuilder sb = new StringBuilder();

            // convert each character to Morse
            for (char ch : word.toCharArray()) {

                // 'a' → index 0, 'b' → index 1 ...
                int index = ch - 'a';

                sb.append(morse[index]);
            }

            // add transformation to set
            set.add(sb.toString());
        }

        // number of unique transformations
        return set.size();
    }
}
