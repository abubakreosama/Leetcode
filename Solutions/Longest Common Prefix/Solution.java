class Solution {
    public String longestCommonPrefix(String[] strs) {
        int k = 200;
        byte counter;
        String prefix = "";
        int i = 0;
        for (String string : strs) {
            if (string.length() < k) {
                k = string.length();
            }
        }
        for (int j = 0; j < k; j++){
            i = 0;
            counter = 0;
            Character elletter = strs[i].charAt(j);
            for (i = 0;i < strs.length; i++) {
                if (elletter.equals(strs[i].charAt(j))) {
                    counter++;
                }
                else {
                    break;
                }
            }
            if (counter == strs.length) {
                prefix += elletter;
            }
            else {
                break;
            }

        }
        return prefix;
    } 
}