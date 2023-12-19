package _1_array._1_陣列的遍歷._1_485_max_consecutive_ones;

public class Solution implements Solution_485 {
    @Override
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int current = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, current);
                current = 0;
                continue;
            }
            current++;
        }
        max = Math.max(max, current);
        return max;
    }
}
