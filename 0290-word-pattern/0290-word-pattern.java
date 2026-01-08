import java.util.*;

class Solution {
    public boolean wordPattern(String pattern, String s) {

        // Split string into words
        String[] words = s.split(" ");

        // Length must match
        if (pattern.length() != words.length) {
            return false;
        }

        // Character → Word mapping
        Map<Character, String> charToWord = new HashMap<>();

        // Word → Character mapping
        Map<String, Character> wordToChar = new HashMap<>();

        // Traverse pattern and words together
        for (int i = 0; i < pattern.length(); i++) {

            char ch = pattern.charAt(i);
            String word = words[i];

            // Check character → word
            if (charToWord.containsKey(ch)) {
                if (!charToWord.get(ch).equals(word)) {
                    return false;
                }
            } else {
                charToWord.put(ch, word);
            }

            // Check word → character
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != ch) {
                    return false;
                }
            } else {
                wordToChar.put(word, ch);
            }
        }

        return true;
    }
}
