package _1_array._2_統計陣列中的元素._5_41_first_missing_positive;

public class Solution1 implements Solution_41 {
    @Override
    public int firstMissingPositive(int[] nums) {
        int a = 0;
        int res = 0;
        // 找出第一個正整數
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            a = nums[i];
            break;
        }
        if (a == 0) {
            return 1;
        }
        // 將非正整數的數字替換為第一個正整數
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                continue;
            }
            nums[i] = a;
        }
        // 將非正整數的數字替換為第一個正整數
        for (int num: nums) {
            int index = Math.abs(num);
            if (index > nums.length) {
                continue;
            }
            if (nums[index - 1] < 0) {
                continue;
            }
            nums[index - 1] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            res = i + 1;
            break;
        }

        return res != 0 ? res: nums.length + 1;
    }
}
