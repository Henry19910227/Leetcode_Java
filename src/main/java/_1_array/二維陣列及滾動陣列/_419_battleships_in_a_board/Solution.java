package _1_array.二維陣列及滾動陣列._419_battleships_in_a_board;

public class Solution implements Solution_419 {
    @Override
    public int countBattleships(char[][] board) {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != 'X') { continue; }
                dfs(i, j, board);
                count++;
            }
        }
        return count;
    }

    private void dfs(int x, int y, char[][] board) {
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length) {
            return;
        }
        if (board[x][y] != 'X') {
            return;
        }
        board[x][y] = '.';
        dfs(x-1, y, board);
        dfs(x, y+1, board);
        dfs(x+1, y, board);
        dfs(x, y-1, board);
    }
}
