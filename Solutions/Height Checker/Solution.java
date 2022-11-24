import java.util.Arrays;

class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        int non =0;
        for (int i =0; i< heights.length;i++){
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        for (int j = 0; j<expected.length; j++){
            if(heights[j] != expected[j]){
                non++;
            }
        }
        return non;
    }
}