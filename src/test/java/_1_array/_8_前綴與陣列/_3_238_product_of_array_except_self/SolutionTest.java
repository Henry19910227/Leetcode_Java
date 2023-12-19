package _1_array._8_前綴與陣列._3_238_product_of_array_except_self;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {1,2,3,4};
        Solution_238 solution = new Solution();
        int[] output = solution.productExceptSelf(nums);
        int[] expect = {24,12,8,6};
        Assertions.assertArrayEquals(expect, output);
    }
}
