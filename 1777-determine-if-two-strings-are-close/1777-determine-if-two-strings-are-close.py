class Solution:
    def closeStrings(self, word1: str, word2: str) -> bool:
        return True if (sorted(list(Counter(word1).values())) == sorted(list(Counter(word2).values())) and set(word1) == set(word2)) else False