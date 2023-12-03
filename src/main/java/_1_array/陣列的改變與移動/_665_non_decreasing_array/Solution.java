package _1_array.陣列的改變與移動._665_non_decreasing_array;

public class Solution implements Solution_665 {
    @Override
    public boolean checkPossibility(int[] nums) {
        int modify = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i-1]) { continue; }
            modify++;
            if (modify >= 2) { return false; }
            if (i < 2 || nums[i-2] <= nums[i]) {
                nums[i-1] = nums[i];
            } else {
                nums[i] = nums[i-1];
            }
        }
        return true;
    }
}
