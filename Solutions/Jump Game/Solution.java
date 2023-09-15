class Solution {
    public boolean canJump(int[] nums) {
        int lastReachableIndex = nums.length - 1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] + i >= lastReachableIndex) {
                lastReachableIndex = i;
            }  
        }
        return lastReachableIndex == 0;
    }
}