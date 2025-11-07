class Solution {
    public int myAtoi(String s) {
        
        // Step 1: Remove leading/trailing spaces
        s=s.trim();
        if (s.length() == 0) return 0;

        int i = 0;
        int sign = 1;
        long result = 0;  // use long to prevent overflow

        if (s.charAt(i) == '+') {
            i++;
         } else if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }
         // Step 3: Read digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;
        // Step 4: Handle overflow
            if (sign * result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign * result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        i++;
        }
         return (int) (sign * result);
    }
}