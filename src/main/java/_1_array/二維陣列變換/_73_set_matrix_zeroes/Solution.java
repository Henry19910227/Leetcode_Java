package _1_array.二維陣列變換._73_set_matrix_zeroes;

import java.util.HashMap;
import java.util.Map;

public class Solution implements Solution_73 {
    @Override
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        Map<Integer,Integer> xmap = new HashMap<>();
        Map<Integer,Integer> ymap = new HashMap<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] != 0) {
                    continue;
                }
                xmap.put(i, i);
                ymap.put(j, j);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!xmap.containsKey(i) && !ymap.containsKey(j)) {
                    continue;
                }
                matrix[i][j] = 0;
            }
        }
    }
}
