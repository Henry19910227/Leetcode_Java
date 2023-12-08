package _1_array.陣列的旋轉._396_rotate_function;

public class Solution implements Solution_396 {
    @Override
    public int maxRotateFunction(int[] nums) {
        int sum = 0;
        int max;
        //計算sum
        for (int num: nums) {
            sum += num;
        }
        int f = 0;
        //計算 F(0)
        for (int k = 0; k < nums.length; k++) {
            f += nums[k] * k;
        }
        max = f;
        //計算 MAX(F(k))
        for (int k = 1; k < nums.length; k++) {
            f = f + sum - nums.length * nums[nums.length - k];
            max = Math.max(max, f);
        }
        return max;
    }
}
