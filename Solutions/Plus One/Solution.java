class Solution {
    public int[] plusOne(int[] digits) {
        int i = digits.length - 1;
        while (i >= 0) {
            if (digits[i] != 9) {
                digits[i]++;
                break;
            }
            else {
                digits[i] = 0;
                if (i == 0) {
                    int[] raji = new int[digits.length + 1];
                    raji[0] = 1;
                    for (int k = 1; k < raji.length; k++) {
                        raji[k] = digits[k-1];
                    }
                    return raji;
                }
                i--;
            }
        }
        return digits;
    }
}