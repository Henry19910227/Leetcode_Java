package _1_array._7_二維陣列變換._3_73_set_matrix_zeroes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test1() {
        Solution_73 solution = new Solution();

        int[][] matrix = {{1,1,1},{1,0,1},{1,1,1}};
        solution.setZeroes(matrix);
        int[][] except = {{1,0,1},{0,0,0},{1,0,1}};
        assertArrayEquals(except, matrix);
    }
    @Test
    void test2() {
        Solution_73 solution = new Solution();

        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        solution.setZeroes(matrix);
        int[][] except = {{0,0,0,0},{0,4,5,0},{0,3,1,0}};
        assertArrayEquals(except, matrix);
    }
}
