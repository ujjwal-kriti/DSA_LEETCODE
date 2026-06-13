class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        s=set(nums)
        longest=0
        for n in s:
            if n-1 not in s:
                current=n
                length=1
                while current+1 in s:
                    length+=1
                    current+=1
                longest=max(longest,length)
        return longest