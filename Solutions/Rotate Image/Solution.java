class Solution {
    public void rotate(int[][] matrix) {
        getTranspose(matrix);
        int temp;
        int i = 0;
        int j = matrix.length - 1;
        while (i < j) {
            for (int k = 0; k < matrix.length; k++) {
                temp = matrix[k][i];
                matrix[k][i] = matrix[k][j];
                matrix[k][j] = temp;
            }
            i++;
            j--;
        }
    }
    public void getTranspose(int[][] matrix) {
        int temp;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (i == j) {
                    continue;
                }
                else {
                    temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
    }
}