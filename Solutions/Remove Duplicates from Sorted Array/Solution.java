class Solution {
    public int removeDuplicates(int[] nums) {
        int size = 1;
        for(int i=0;i<nums.length -1;i++){
            if (nums[i] != nums[i+1]){
                nums[size] = nums[i+1];
                size++;
            }

        }
        return size;
    }
}