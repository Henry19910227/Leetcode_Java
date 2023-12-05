package _1_array.二維陣列及滾動陣列._598_range_addition_II;

import java.util.Arrays;

public class Solution implements Solution_598 {
    @Override
    public int maxCount(int m, int n, int[][] ops) {
        int minX = m;
        int minY = n;
        for (int[] area: ops) {
            minX = Math.min(minX, area[0]);
            minY = Math.min(minY, area[1]);
        }
        return minX * minY;
    }
}
