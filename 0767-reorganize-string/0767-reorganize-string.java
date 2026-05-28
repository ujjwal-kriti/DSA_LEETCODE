class Solution {

    public String reorganizeString(String s) {

        int n = s.length();

        int[] freq = new int[26];

        // count frequency
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        // find max frequency char
        int maxFreq = 0;
        char maxChar = ' ';

        for(int i = 0; i < 26; i++) {

            if(freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = (char)(i + 'a');
            }
        }

        // impossible case
        if(maxFreq > (n + 1) / 2) {
            return "";
        }

        char[] ans = new char[n];

        int index = 0;

        // place max frequency char first
        while(freq[maxChar - 'a'] > 0) {

            ans[index] = maxChar;

            index += 2;

            freq[maxChar - 'a']--;
        }

        // place remaining chars
        for(int i = 0; i < 26; i++) {

            while(freq[i] > 0) {

                // if even indexes finished
                if(index >= n) {
                    index = 1;
                }

                ans[index] = (char)(i + 'a');

                index += 2;

                freq[i]--;
            }
        }

        return new String(ans);
    }
}