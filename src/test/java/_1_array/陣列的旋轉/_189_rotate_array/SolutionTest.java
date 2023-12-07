package _1_array.陣列的旋轉._189_rotate_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {1,2,3,4,5,6,7};
        Solution_189 solution = new Solution();
        solution.rotate(nums, 3);
        int [] except = {5,6,7,1,2,3,4};
        assertArrayEquals(except, nums);
    }
}
