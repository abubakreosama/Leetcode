class Solution {
    public int minPairSum(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] > ans) {
                ans = nums[left] + nums[right];
            }
            left++;
            right--;
        }
        return ans;
    }
}