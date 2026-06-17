class Solution:
    def removeKdigits(self, num: str, k: int) -> str:

        stack = []

        for digit in num:

            while k > 0 and stack and stack[-1] > digit:
                stack.pop()
                k -= 1

            stack.append(digit)

        # If k still remains
        while k > 0:
            stack.pop()
            k -= 1

        # Convert to string and remove leading zeros
        ans = ''.join(stack).lstrip('0')

        return ans if ans else "0"