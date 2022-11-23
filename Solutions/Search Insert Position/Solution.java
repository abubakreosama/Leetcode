class Solution {
    public int searchInsert(int[] nums, int target) {
                int low = 0;
        int high = nums.length;
        int mid = 0;
        while (low <= high) {
            mid = (int) ((low + high) / 2 );
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                if (mid == 0) {
                    if (nums[mid] > target) {
                        return 0;
                    }
                    else {
                        return 1;
                    }
                }
                if (nums[mid] > target && nums[mid-1] < target) {
                    return mid;
                }
                high = mid;
            }
            else if (nums[mid] < target) {
                if (mid == nums.length-1) {
                    if (nums[mid] > target) {
                        return mid;
                    }
                    else {
                        return nums.length;
                    }
                }
                if (nums[mid] < target && nums[mid+1] > target) {
                    return mid + 1;
                }
                low = mid;
            }
        }
        return mid;
    }
}