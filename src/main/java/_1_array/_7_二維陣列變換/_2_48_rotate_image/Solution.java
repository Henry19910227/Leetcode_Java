package _1_array._7_二維陣列變換._2_48_rotate_image;

public class Solution implements Solution_48 {
    @Override
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = k; j < n; j++) {
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
            k++;
        }
        int left = 0;
        int right = n - 1;
        while (left < right) {
            for (int i = 0; i < m; i++) {
                int tmp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = tmp;
            }
            left++;
            right--;
        }
    }
}
