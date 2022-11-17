class Solution:
    def romanToInt(self, s: str) -> int:
        result = 0
        skip = False

        for char in range(len(s)):
            if skip == True:
                skip = False
                continue
            if (s[char] == "I"):
                if (char + 1 < len(s)):  
                    if (s[char + 1] == "V"):
                        result = result + 4
                        skip = True
                    elif (s[char + 1] == "X"):
                        result = result + 9
                        skip = True
                    else:
                        result = result + 1
                else:
                    result = result + 1
            elif (s[char] == "V"):
                result = result + 5
            elif (s[char] == "X"):
                if (char + 1 < len(s)):
                    if (s[char + 1] == "L"):
                        result = result + 40
                        skip = True
                    elif (s[char + 1] == "C"):
                        result = result + 90
                        skip = True
                    else:
                        result = result + 10
                else:
                    result = result + 10
            elif (s[char] == "L"):
                result = result + 50
            elif (s[char] == "C"):
                if (char + 1 < len(s)):
                    if (s[char + 1] == "D"):
                        result = result + 400
                        skip = True
                    elif (s[char + 1] == "M"):
                        result = result + 900
                        skip = True
                    else:
                        result = result + 100
                else:
                    result = result + 100
            elif (s[char] == "D"):
                result = result + 500
            elif (s[char] == "M"):
                result = result + 1000
        return result