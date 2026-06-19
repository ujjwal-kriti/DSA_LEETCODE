class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        n=len(gain)
        altitude=0
        highest=0
        for i in range(n):
            altitude+=gain[i]
            highest=max(highest,altitude)
        return highest

        