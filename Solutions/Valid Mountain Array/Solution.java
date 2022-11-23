class Solution {
    public boolean validMountainArray(int[] arr) {
        int i = 0;
        int n = arr.length;
        boolean isMountain = false;
        if (arr.length < 3) {
            return isMountain;
        }
        while(i < n-1 && arr[i] < arr[i+1]) {
            i++;
        }
        if (i == 0 || i==n-1) {
            return isMountain;
        }
        while(i < n-1 && arr[i] > arr[i+1]) {
            i++;
        }
        if(i == n-1) {
            isMountain = true;
        }
        return isMountain;
    }
}