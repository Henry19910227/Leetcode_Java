package _8_two_pointer.同向雙指針與滑動窗口._27_remove_element;

public class Solution implements Solution_27 {
    @Override
    public int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                continue;
            }
            nums[k] = nums[i];
            k++;
        }
        return k;
    }
}
