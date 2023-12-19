package _1_array._4_二維陣列及滾動陣列._4_598_range_addition_II;

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
