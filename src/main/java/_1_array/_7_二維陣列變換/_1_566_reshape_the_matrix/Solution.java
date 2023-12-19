package _1_array._7_二維陣列變換._1_566_reshape_the_matrix;

public class Solution implements Solution_566 {
    @Override
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int row = 0;
        int col = -1;
        int[][] ans = new int[r][c];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                col++;
                ans[row][col] = mat[i][j];
                if (col == c-1) {
                    col = -1;
                    row++;
                }
            }
        }
        return ans;
    }
}
