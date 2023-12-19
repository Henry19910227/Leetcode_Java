package _1_array._6_特定順序遍歷二維陣列._2_59_spiral_matrix_II;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test() {
        Solution_59 solution = new Solution();

        int input1 = 3;
        int[][] output1 = solution.generateMatrix(input1);
        int[][] except1 = {{1,2,3},{8,9,4},{7,6,5}};
        assertArrayEquals(except1, output1);

        int input2 = 1;
        int[][] output2 = solution.generateMatrix(input2);
        int[][] except2 = {{1}};
        assertArrayEquals(except2, output2);
    }
}
