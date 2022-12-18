class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] maximumProfit = new int[n];
        if (n == 1) {
            return nums[0];
        }
        if (n == 2) {
            return Math.max(nums[0],nums[1]);
        }
        else {
            maximumProfit[0] = nums[0];
            maximumProfit[1] = Math.max(nums[0],nums[1]);
            for (int i = 2; i < n; i++) {
                maximumProfit[i] = Math.max(maximumProfit[i - 1], nums[i] + maximumProfit[i - 2]);
            }
        }
        return maximumProfit[n-1];
    }
}