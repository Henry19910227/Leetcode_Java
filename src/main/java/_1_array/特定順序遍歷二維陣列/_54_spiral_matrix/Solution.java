package _1_array.特定順序遍歷二維陣列._54_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Solution_54 {
    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        int count = 0;
        while (count < matrix.length * matrix[0].length) {
            for (int i = left; i <= right; i++) {
                result.add(matrix[top][i]);
                count++;
            }
            top++;
            if (count >= matrix.length * matrix[0].length) { break; }
            for (int i = top; i <= bottom; i++) {
                result.add(matrix[i][right]);
                count++;
            }
            right--;
            if (count >= matrix.length * matrix[0].length) { break; }
            for (int i = right; i >= left; i--) {
                result.add(matrix[bottom][i]);
                count++;
            }
            bottom--;
            if (count >= matrix.length * matrix[0].length) { break; }
            for (int i = bottom; i >= top; i--) {
                result.add(matrix[i][left]);
                count++;
            }
            left++;
        }
        return result;
    }
}
