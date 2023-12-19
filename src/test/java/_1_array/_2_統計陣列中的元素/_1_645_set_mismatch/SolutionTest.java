package _1_array._2_統計陣列中的元素._1_645_set_mismatch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] input = {3,2,3,4,6,5};
        Solution_645 solution = new Solution();
        int[] output = solution.findErrorNums(input);
        assertArrayEquals(new int[]{3,1}, output);
    }
}
