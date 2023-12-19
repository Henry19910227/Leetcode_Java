package _1_array._6_特定順序遍歷二維陣列._3_498_diagonal_traverse;

public class Solution implements Solution_498 {
    // 00 01 02 03 04
    // 10 11 12 13 14
    // 20 21 22 23 24
    // 30 31 32 33 34
    @Override
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] ans = new int[m * n];
        int row = 0;
        int col = 0;
        int i = 0;
        boolean up = true;
        while (row < m && col < n) {
            if (up) {
                while (row > 0 && col < n-1) {
                    ans[i++] = mat[row][col];
                    row--;
                    col++;
                }
                ans[i++] = mat[row][col];
                if (col == n-1) {
                    row++;
                } else {
                    col++;
                }
            } else {
                while (row < m-1 && col > 0) {
                    ans[i++] = mat[row][col];
                    row++;
                    col--;
                }
                ans[i++] = mat[row][col];
                if (row == m-1) {
                    col++;
                } else {
                    row++;
                }
            }
            up = !up;
        }
        return ans;
    }
}
