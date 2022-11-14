class Solution:
    def isValid(self, s: str) -> bool:
        mystack = []
        for paren in s:
            if (paren == "(" or paren == "[" or paren == "{"):
                mystack.append(paren)
            else:
                if(len(mystack) == 0):
                    return False
                elif (mystack[-1] == "(" and paren == ")"):
                    mystack.pop()
                elif (mystack[-1] == "[" and paren == "]"):
                    mystack.pop()
                elif (mystack[-1] == "{" and paren == "}"):
                    mystack.pop()
                else:
                    return False
        return len(mystack) == 0
        