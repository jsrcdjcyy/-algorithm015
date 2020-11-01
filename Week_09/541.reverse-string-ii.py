class Solution:
    def reverseStr(self, s: str, k: int) -> str:
        ls = list(s)
        for i in range(0, len(ls), 2 * k):
            left = i
            right = i + k - 1 if i + k - 1 < len(ls) else len(ls) - 1
            while left <= right:
                ls[left], ls[right] = ls[right], ls[left]
                left += 1
                right -= 1
        return "".join(ls)