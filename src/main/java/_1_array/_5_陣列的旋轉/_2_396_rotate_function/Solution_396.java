package _1_array._5_陣列的旋轉._2_396_rotate_function;

// https://leetcode.com/problems/rotate-function/
// [4,3,2,6] = [a, b, c, d]
// F(0) = 0a + 1b + 2c + 3d
// F(1) = f(0) + 0d + 1a + 2b + 3c
// F(1) = f(0) +  1a + 1b + 1c + (-3d)
// = f(0) + SUM + (-4d)
// = f(0) + SUM - (nums.length * nums[nums.length - 1])
// f(k) = f(k-1) + SUM - (nums.length * nums[nums.length - k])
public interface Solution_396 {
    int maxRotateFunction(int[] nums);
}
