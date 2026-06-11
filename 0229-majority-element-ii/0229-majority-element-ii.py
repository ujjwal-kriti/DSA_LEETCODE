class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        freq={}
        for num in nums:
            freq[num]=freq.get(num,0)+1
        ans=[]
        for key,value in freq.items():
            if value>len(nums)//3:
                ans.append(key)
        return ans