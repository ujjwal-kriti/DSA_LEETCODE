class Solution {
    public int numSteps(String s) {
        
        int steps = 0;
        int carry = 0;

        // Traverse from right to left (ignore first bit)
        for (int i = s.length() - 1; i > 0; i--) {

            int bit = s.charAt(i) - '0';

            if (bit + carry == 1) {
                // Odd case → add 1 (carry generated)
                steps += 2;   // one for +1, one for divide by 2
                carry = 1;
            } else {
                // Even case
                steps += 1;   // only divide by 2
            }
        }

        // If carry remains at MSB
        return steps + carry;
    }
}