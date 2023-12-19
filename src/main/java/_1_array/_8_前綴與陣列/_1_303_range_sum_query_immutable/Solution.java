package _1_array._8_前綴與陣列._1_303_range_sum_query_immutable;

public class Solution implements Solution_303 {
    private int[] nums;
    public Solution(int[] nums) {
        this.nums = new int[nums.length];
        this.nums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            this.nums[i] = this.nums[i-1] + nums[i];
        }
    }
    @Override
    public int sumRange(int left, int right) {
        if (left == 0) {
            return this.nums[right];
        }
        return this.nums[right] - this.nums[left - 1];
    }
}
