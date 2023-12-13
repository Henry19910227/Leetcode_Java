package _1_array.二維陣列變換._566_reshape_the_matrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test() {
        Solution_566 solution = new Solution();

        int[][] input1 = {{1,2},{3,4}};
        int r = 1;
        int c = 4;
        int[][] output1 = solution.matrixReshape(input1, r, c);
        int[][] except1 = {{1,2,3,4}};
        assertArrayEquals(except1, output1);

        int[][] input2 = {{1,2},{3,4}};
        r = 2;
        c = 4;
        int[][] output2 = solution.matrixReshape(input2, r, c);
        int[][] except2 = {{1,2},{3,4}};
        assertArrayEquals(except2, output2);

        int[][] input3 = {{1,2},{3,4}};
        r = 4;
        c = 1;
        int[][] output3 = solution.matrixReshape(input3, r, c);
        int[][] except3 = {{1},{2},{3},{4}};
        assertArrayEquals(except3, output3);
    }
}
