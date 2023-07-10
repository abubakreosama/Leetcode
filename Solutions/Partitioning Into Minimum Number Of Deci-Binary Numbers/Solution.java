class Solution {
    public int minPartitions(String n) {
        int ans = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) - '0' > ans) {
                ans = n.charAt(i) - '0';
            }
        }
        return ans;
    }
}