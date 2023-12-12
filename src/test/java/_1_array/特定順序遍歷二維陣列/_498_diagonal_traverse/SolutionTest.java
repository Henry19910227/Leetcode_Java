package _1_array.特定順序遍歷二維陣列._498_diagonal_traverse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test() {
        Solution_498 solution = new Solution();

        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[] output1 = solution.findDiagonalOrder(input1);
        int[] except1 = {1,2,4,7,5,3,6,8,9};
        assertArrayEquals(except1, output1);

        int[][] input2 = {{1,2},{3,4}};
        int[] output2 = solution.findDiagonalOrder(input2);
        int[] except2 = {1,2,3,4};
        assertArrayEquals(except2, output2);
    }
}
