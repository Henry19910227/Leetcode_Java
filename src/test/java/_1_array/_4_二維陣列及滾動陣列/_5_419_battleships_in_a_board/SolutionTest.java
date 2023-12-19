package _1_array._4_二維陣列及滾動陣列._5_419_battleships_in_a_board;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        char[][] nums = {{'X','.','.','X'}, {'.','.','.','X'}, {'.','.','.','X'}, {'.','.','.','.'}};
        Solution_419 solution = new Solution();
        int output = solution.countBattleships(nums);
        assertEquals(2, output);
    }
}
