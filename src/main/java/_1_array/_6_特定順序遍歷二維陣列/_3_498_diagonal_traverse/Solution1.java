package _1_array._6_特定順序遍歷二維陣列._3_498_diagonal_traverse;

public class Solution1 implements Solution_498 {
    @Override
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] arr = new int[m * n];
        int row = 0;
        int col = 0;
        int i = 0;
        boolean up = true;
        while(row<m && col<n) {
            //if diagonal is going up
            if(up) {
                while(row>0 && col<n-1) {
                    arr[i++] = mat[row][col];
                    row--;
                    col++;
                }
                arr[i++] = mat[row][col];
                if(col==n-1){
                    row++;
                } else{
                    col++;
                }

            } //if diagonal is going down
            else {
                while(col>0 && row<m-1) {
                    arr[i++] = mat[row][col];
                    row++;
                    col--;
                }
                arr[i++] = mat[row][col];
                if(row==m-1){
                    col++;
                } else{
                    row++;
                }
            }
            up = !up;
        }

        return arr;
    }
}
