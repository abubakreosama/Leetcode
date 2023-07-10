class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[nums.length*2];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        for (int j = nums.length; j < ans.length; j++) {
            ans[j] = nums[j - nums.length];
        }
        return ans;
    }
}