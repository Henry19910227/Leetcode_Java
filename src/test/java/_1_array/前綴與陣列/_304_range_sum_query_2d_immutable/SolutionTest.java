package _1_array.前綴與陣列._304_range_sum_query_2d_immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[][] nums = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        Solution_304 solution = new Solution(nums);
        assertEquals(8, solution.sumRegion(2, 1, 4, 3));
        assertEquals(11, solution.sumRegion(1, 1, 2, 2));
        assertEquals(12, solution.sumRegion(1, 2, 2, 4));
    }
}
