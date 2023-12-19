package _1_array._7_二維陣列變換._2_48_rotate_image;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test1() {
        Solution_48 solution = new Solution();

        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        solution.rotate(matrix);
        int[][] except = {{7,4,1},{8,5,2},{9,6,3}};
        assertArrayEquals(except, matrix);
    }
    @Test
    void test2() {
        Solution_48 solution = new Solution();

        int[][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        solution.rotate(matrix);
        int[][] except = {{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}};
        assertArrayEquals(except, matrix);
    }
}
