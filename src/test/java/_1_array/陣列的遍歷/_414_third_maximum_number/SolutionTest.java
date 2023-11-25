package _1_array.陣列的遍歷._414_third_maximum_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {2,2,3,1};
        Solution_414 solution = new Solution();
        int output = solution.thirdMax(nums);
        assertEquals(1, output);
    }
}
