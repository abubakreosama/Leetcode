class Solution {
    public int findNumbers(int[] nums) {
        int digits = 0;
        short evens = 0;
        for (short i = 0; i < nums.length; i++){
            digits = 0;
            while (nums[i] !=0){
                nums[i] = nums[i]/10;
                digits++;
            }
            if (digits%2==0){
                evens++;
            }
        }
        return evens;
    }
}