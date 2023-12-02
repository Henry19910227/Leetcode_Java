package _1_array.陣列的改變與移動._453_minimum_moves_to_equal_array_elements;

// 此解法為較快速地解
public class Solution implements Solution_453{
    @Override
    public int minMoves(int[] nums) {
        if (nums.length <= 1) { return 0; }
        int min = Integer.MAX_VALUE;
        for (int num: nums) {
            min = Math.min(min, num);
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            count += (nums[i] - min);
        }
        return count;
    }
}
