class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        HashMap<Integer,Integer> horizontal = new HashMap<>();
        HashMap<Integer,Integer> vertical = new HashMap<>();
        int sumOfMax = 0;
        int maximumVertical;
        int maximumHorizontal;
        int temp;
        for (int i = 0; i < grid.length; i++) {
            maximumVertical = 0;
            for (int j = 0; j < grid.length; j++) {
                maximumHorizontal = 0;
                if (vertical.containsKey(i)) {
                    maximumVertical = vertical.get(i);
                }
                else {
                    temp = 0;
                    for (int k = 0; k < grid.length; k++) {
                        if (grid[i][k] > temp) {
                            temp = grid[i][k];
                        }
                    }
                    vertical.put(i, temp);
                    maximumVertical = temp;
                }
                if (horizontal.containsKey(j)) {
                    maximumHorizontal = horizontal.get(j);
                }
                else {
                    temp = 0;
                    for (int k = 0; k < grid.length; k++) {
                        if (grid[k][j] > temp) {
                            temp = grid[k][j];
                        }
                    }
                    horizontal.put(j, temp);
                    maximumHorizontal = temp;
                }

                sumOfMax+= Math.min(maximumHorizontal, maximumVertical) - grid[i][j];

            }
        }
        return sumOfMax;
    }
}