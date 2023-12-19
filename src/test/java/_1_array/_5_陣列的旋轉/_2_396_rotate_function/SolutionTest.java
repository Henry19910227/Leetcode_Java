package _1_array._5_陣列的旋轉._2_396_rotate_function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        Solution_396 solution = new Solution();

        int[] nums1 = {4,3,2,6};
        int output1 = solution.maxRotateFunction(nums1);
        assertEquals(26, output1);

        int[] nums2 = {1,2,3,4,5,6,7,8,9,10};
        int output2 = solution.maxRotateFunction(nums2);
        assertEquals(330, output2);

        int[] nums3 = {100};
        int output3 = solution.maxRotateFunction(nums3);
        assertEquals(0, output3);
    }
}
