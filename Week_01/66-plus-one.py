class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        if digits[-1] <= 8:
            digits[-1] += 1
            return digits
        j = 0      
        for i in range(len(digits)-1, -1, -1):
            if digits[i] == 9:
                j += 1
                continue
            else:
                break
        if j == len(digits):
            res = [1]
            for i in range(len(digits)):
                res = res + [0]
            return res
        else:
            digits[len(digits) - j - 1] += 1
            for i in range(len(digits) - j, len(digits)):
                digits[i] = 0
            return digits