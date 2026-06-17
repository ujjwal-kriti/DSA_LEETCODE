class Solution:
    def processStr(self, s: str, k: int) -> str:
        lengths = []
        curr_len = 0

        # Calculate length after each operation
        for ch in s:
            if 'a' <= ch <= 'z':
                curr_len += 1
            elif ch == '*':
                if curr_len > 0:
                    curr_len -= 1
            elif ch == '#':
                curr_len *= 2
            elif ch == '%':
                pass

            lengths.append(curr_len)

        # k out of bounds
        if k >= curr_len:
            return '.'

        # Work backwards
        for i in range(len(s) - 1, -1, -1):
            ch = s[i]
            curr_len = lengths[i]
            prev_len = lengths[i - 1] if i > 0 else 0

            if 'a' <= ch <= 'z':
                if k == curr_len - 1:
                    return ch

            elif ch == '*':
                pass

            elif ch == '#':
                k %= prev_len

            elif ch == '%':
                k = curr_len - 1 - k

        return '.'