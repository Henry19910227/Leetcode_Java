package _1_array._4_二維陣列及滾動陣列._4_598_range_addition_II;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[][] ops = {{2,2},{3,3},{3,3},{3,3},{2,2},{3,3},{3,3},{3,3},{3,3}};
        Solution_598 solution = new Solution();
        int output = solution.maxCount(3, 3, ops);
        assertEquals(4 ,output);
    }
}
