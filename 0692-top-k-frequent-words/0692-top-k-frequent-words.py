class Solution:
    def topKFrequent(self, words, k):

        freq = {}

        # count frequency
        for word in words:
            freq[word] = freq.get(word, 0) + 1

        # sort
        arr = sorted(freq.keys(), key=lambda x: (-freq[x], x))

        return arr[:k]