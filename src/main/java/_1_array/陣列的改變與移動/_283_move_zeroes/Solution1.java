package _1_array.陣列的改變與移動._283_move_zeroes;

public class Solution1 implements Solution_283{
    @Override
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) { continue; }
            int tmp = nums[j];
            nums[j] = nums[i];
            nums[i] = tmp;
            j++;
        }
    }
}
