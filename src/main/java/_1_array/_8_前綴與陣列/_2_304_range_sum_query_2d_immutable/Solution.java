package _1_array._8_前綴與陣列._2_304_range_sum_query_2d_immutable;
// https://leetcode.com/problems/range-sum-query-2d-immutable/solutions/2106643/java-tc-o-1-query-sum-approach-with-explanation/
public class Solution implements Solution_304 {
    private int[][] nums;
    public Solution(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        nums = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                nums[i][j] = nums[i][j-1] + nums[i-1][j] + matrix[i-1][j-1] - nums[i-1][j-1];
            }
        }
    }
    @Override
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return nums[row2+1][col2+1] - nums[row1][col2+1] - nums[row2+1][col1] + nums[row1][col1];
    }
}
