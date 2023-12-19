package _1_array._8_前綴與陣列._1_303_range_sum_query_immutable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {-2, 0, 3, -5, 2, -1};
        Solution_303 solution = new Solution(nums);
        assertEquals(1 , solution.sumRange(0, 2));
        assertEquals(-1 , solution.sumRange(2, 5));
        assertEquals(-3 , solution.sumRange(0, 5));
    }
}
