package _1_array.陣列的改變與移動._665_non_decreasing_array;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {
    @Test
    void test() {
        int[] input = {1, 4, 1, 2};
        Solution_665 solution = new Solution();
        boolean output = solution.checkPossibility(input);
        assertTrue(output);
    }
}
