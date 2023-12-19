package _1_array._3_陣列的改變與移動._1_453_minimum_moves_to_equal_array_elements;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] input1 = {1, 2, 3, 4};
        int[] input2 = {1, 1, 1};
        int[] input3 = {1, 1, 5};
        int[] input4 = {0, 0, 100};
        int[] input5 = {5, 6, 8, 8, 5};
        Solution_453 solution = new Solution();

        int output1 = solution.minMoves(input1);
        assertEquals(6, output1);

        int output2 = solution.minMoves(input2);
        assertEquals(0, output2);

        int output3 = solution.minMoves(input3);
        assertEquals(4, output3);

        int output4 = solution.minMoves(input4);
        assertEquals(100, output4);

        int output5 = solution.minMoves(input5);
        assertEquals(7, output5);
    }
}
