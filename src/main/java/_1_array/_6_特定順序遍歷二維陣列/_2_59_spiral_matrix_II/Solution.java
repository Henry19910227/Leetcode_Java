package _1_array._6_特定順序遍歷二維陣列._2_59_spiral_matrix_II;

public class Solution implements Solution_59{
    @Override
    public int[][] generateMatrix(int n) {
        int[][] ans = new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int count = 0;
        while (count < n * n) {
            for (int i = left; i <= right; i++) {
                count++;
                ans[top][i] = count;
            }
            top++;
            if (count == n * n) { break; }

            for (int i = top; i <= bottom; i++) {
                count++;
                ans[i][right] = count;
            }
            right--;
            if (count == n * n) { break; }

            for (int i = right; i >= left; i--) {
                count++;
                ans[bottom][i] = count;
            }
            bottom--;
            if (count == n * n) { break; }

            for (int i = bottom; i >= top; i--) {
                count++;
                ans[i][left] = count;
            }
            left++;
        }
        return ans;
    }
}
