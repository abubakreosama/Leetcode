class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        int count = 0;
        for(int i = trimmedString.length() - 1; i >= 0; i--) {
            if (trimmedString.charAt(i) == ' ') {
                break;
            }
            count++;
        }
        return count;
    }
}