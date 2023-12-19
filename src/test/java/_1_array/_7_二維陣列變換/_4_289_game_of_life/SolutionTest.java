package _1_array._7_二維陣列變換._4_289_game_of_life;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test1() {
        Solution_289 solution = new Solution();

        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        solution.gameOfLife(board);
        int[][] except = {{0,0,0},{1,0,1},{0,1,1},{0,1,0}};
        assertArrayEquals(except, board);

    }
}
