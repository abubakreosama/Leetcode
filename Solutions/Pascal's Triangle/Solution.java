import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> triRow;
        for (int i = 1; i<= numRows; i++) {
            triRow = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    triRow.add(1);
                }
                else {
                    triRow.add(triangle.get(i - 2).get(j - 1) + triangle.get(i - 2).get(j));
                }
            }
            triangle.add(triRow);
        }
        return triangle;
    }
}