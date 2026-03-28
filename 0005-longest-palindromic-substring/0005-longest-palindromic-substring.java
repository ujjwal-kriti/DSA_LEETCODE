class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";

        int start = 0, end = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = i, right = i;

            // Odd length palindrome
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left > end - start) {
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }

            // Even length palindrome (center between i and i+1)
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                if (right - left > end - start) {
                    start = left;
                    end = right;
                }
                left--;
                right++;
            }
        }

        return s.substring(start, end + 1);
    }
}


// class Solution {
//     public String longestPalindrome(String s) {
//         if (s == null || s.length() < 1) return "";
        
//         int start = 0, end = 0; // store the start and end index of the longest palindrome
        
//         for (int i = 0; i < s.length(); i++) {
//             int len1 = expandAroundCenter(s, i, i);       // odd-length palindrome
//             int len2 = expandAroundCenter(s, i, i + 1);   // even-length palindrome
//             int len = Math.max(len1, len2);
            
//             if (len > end - start) {
//                 // Update start and end to new longer palindrome
//                 start = i - (len - 1) / 2;
//                 end = i + len / 2;
//             }
//         }
//         return s.substring(start, end + 1);
//     }

//     private int expandAroundCenter(String s, int left, int right) {
//         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//             left--;
//             right++;
//         }
//         return right - left - 1; // length of palindrome
//     }
// }
