package _1_array._2_統計陣列中的元素._5_41_first_missing_positive;

public class Solution implements Solution_41 {
    @Override
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int position = nums[i]-1;
            // 判斷式 position != nums[position] - 1 避免 [1,1] 的狀況
            // 判斷式 position >= 0 && position < nums.length 避免 element 小於等於 0
            if (position != i && position >= 0 && position < nums.length && position != nums[position] - 1) {
                int tmp = nums[i];
                nums[i] = nums[position];
                nums[position] = tmp;
                continue;
            }
            i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] - 1 == j) {
                continue;
            }
            return j + 1;
        }
        return nums.length + 1;
    }
}
