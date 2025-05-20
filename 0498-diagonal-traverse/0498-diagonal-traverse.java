class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) return new int[0];
        
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int row = 0, col = 0;
        boolean up = true;

        for (int i = 0; i < result.length; i++) {
            result[i] = mat[row][col];
            if (up) {
                if (col == cols - 1) {
                    row++;
                    up = false;
                } else if (row == 0) {
                    col++;
                    up = false;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == rows - 1) {
                    col++;
                    up = true;
                } else if (col == 0) {
                    row++;
                    up = true;
                } else {
                    row++;
                    col--;
                }
            }
        }

        return result;
    }
}
