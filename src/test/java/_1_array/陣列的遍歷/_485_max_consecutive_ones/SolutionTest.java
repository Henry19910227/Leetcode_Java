package _1_array.陣列的遍歷._485_max_consecutive_ones;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {1,1,0,1,1,1};
        Solution_485 solution = new Solution();
        int output = solution.findMaxConsecutiveOnes(nums);
        assertEquals(3, output);
    }
}
