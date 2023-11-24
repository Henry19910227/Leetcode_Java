package _8_two_pointer.同向雙指針與滑動窗口._27_remove_element;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        Solution solution = new Solution();
        int k = solution.removeElement(nums, val);

        int[] expectedNums = {0, 1, 4, 0, 3, 0, 0, 0};
        assertEquals(k, 5);
        Arrays.sort(nums, 0, k);
        Arrays.sort(expectedNums, 0, k);
        for (int i = 0; i <= k; i++) {
            assertEquals(nums[i], expectedNums[i]);
        }
    }
}
