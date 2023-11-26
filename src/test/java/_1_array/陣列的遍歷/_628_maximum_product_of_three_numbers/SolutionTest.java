package _1_array.陣列的遍歷._628_maximum_product_of_three_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] input = {-100, -98, 3 ,4};
        Solution_628 solution = new Solution();
        int output = solution.maximumProduct(input);
        assertEquals(39200, output);
    }
}
