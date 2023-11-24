package _8_two_pointer.頭尾指標._11_container_with_most_water;

import _8_two_pointer.頭尾指標._11_container_with_most_water.Solution;
import _8_two_pointer.頭尾指標._11_container_with_most_water.Solution_11;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        Solution_11 solution = new Solution();
        int output = solution.maxArea(height);
        assertEquals(49, output);
    }
}
