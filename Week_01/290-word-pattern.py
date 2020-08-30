class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        dict = {}
        strSet = set()
        sList = str.split(" ")
        if len(pattern) != len(sList):
            return False
        for i, s in enumerate(sList):
            if pattern[i] in dict.keys():
                if dict[pattern[i]] != sList[i]:
                    return False
                continue
            else:
                if sList[i] in strSet:
                    return False
                dict[pattern[i]] = sList[i]
                strSet.add(sList[i])
        return True