class Solution:
    def romanToInt(self, s: str) -> int:
        zer = 0
        jaleha = False

        for char in range(len(s)):
            if jaleha == True:
                jaleha = False
                continue
            if (s[char] == "I"):
                if (char + 1 < len(s)):  
                    if (s[char + 1] == "V"):
                        zer = zer + 4
                        jaleha = True
                    elif (s[char + 1] == "X"):
                        zer = zer + 9
                        jaleha = True
                    else:
                        zer = zer + 1
                else:
                    zer = zer + 1
            elif (s[char] == "V"):
                zer = zer + 5
            elif (s[char] == "X"):
                if (char + 1 < len(s)):
                    if (s[char + 1] == "L"):
                        zer = zer + 40
                        jaleha = True
                    elif (s[char + 1] == "C"):
                        zer = zer + 90
                        jaleha = True
                    else:
                        zer = zer + 10
                else:
                    zer = zer + 10
            elif (s[char] == "L"):
                zer = zer + 50
            elif (s[char] == "C"):
                if (char + 1 < len(s)):
                    if (s[char + 1] == "D"):
                        zer = zer + 400
                        jaleha = True
                    elif (s[char + 1] == "M"):
                        zer = zer + 900
                        jaleha = True
                    else:
                        zer = zer + 100
                else:
                    zer = zer + 100
            elif (s[char] == "D"):
                zer = zer + 500
            elif (s[char] == "M"):
                zer = zer + 1000
        return zer