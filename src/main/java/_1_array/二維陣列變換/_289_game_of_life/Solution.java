package _1_array.二維陣列變換._289_game_of_life;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution implements Solution_289 {
    @Override
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int lives = neighbor(board, i-1, j-1) + neighbor(board, i-1, j) + neighbor(board, i-1, j+1) +
                        neighbor(board, i, j-1) + neighbor(board, i, j+1) + neighbor(board, i+1, j-1) +
                        neighbor(board, i+1, j) + neighbor(board, i+1, j+1);
                if (board[i][j] == 1 && lives >= 2 && lives <= 3) {
                    board[i][j] = 3;
                }
                if (board[i][j] == 0 && lives == 3) {
                    board[i][j] = 2;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // 將位元右移一位，例如 11 => 01
                board[i][j] >>= 1;
            }
        }
    }
    private int neighbor(int[][] board, int row, int col) {
        // board[row][col] & 1 為 11 & 01 = 1   10 && 01 = 0
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || (board[row][col] & 1) == 0) { return 0;}
        return 1;
    }
}
