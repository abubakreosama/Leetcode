class Solution {
    public int jump(int[] nums) {
        // Greedy Approach (can be solved in dp too)

		// keep track of the highest point you can jump to        
        int currentMaxReach = 0;
		// keep track of last jump max reach point
        int latestJumpMax = 0;
        int jumps = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            currentMaxReach = Math.max(currentMaxReach, nums[i] + i);
            if (i == latestJumpMax) {
                jumps++;
                latestJumpMax = currentMaxReach;
            }
        }
        return jumps;
    }
}