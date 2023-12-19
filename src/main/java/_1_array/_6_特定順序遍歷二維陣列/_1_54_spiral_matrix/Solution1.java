package _1_array._6_特定順序遍歷二維陣列._1_54_spiral_matrix;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// This is my fist way to solve this problem,
// but this way wast more space to storage the hasp map and stacks of recursion
public class Solution1 implements Solution_54 {
    @Override
    public List<Integer> spiralOrder(int[][] matrix) {
        Map<String, Integer> m = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        List<Integer> status = new ArrayList<>();
        status.add(1);
        status.add(2);
        status.add(3);
        status.add(4);
        travel(0, 0, matrix, m, ans, status);
        return ans;
    }
    private void travel(int x, int y, int[][] matrix, Map<String, Integer> m, List<Integer> ans, List<Integer> status) {
        if (x < 0 || x >= matrix.length || y < 0 || y >= matrix[0].length || m.containsKey(String.format("%d,%d", x, y))) {
            int num = status.remove(0);
            status.add(num);
            return;
        }
        m.put(String.format("%d,%d", x, y), matrix[x][y]);
        ans.add(matrix[x][y]);
        int count = 0;
        while (count < status.size()) {
            count++;
            if (status.get(0) == 1) {
                travel(x - 1, y, matrix, m, ans, status);
            }
            if (status.get(0) == 2) {
                travel(x, y + 1, matrix, m, ans, status);
            }
            if (status.get(0) == 3) {
                travel(x + 1, y, matrix, m, ans, status);
            }
            if (status.get(0) == 4) {
                travel(x, y - 1, matrix, m, ans, status);
            }
        }
    }
}
