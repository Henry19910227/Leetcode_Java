package _8_two_pointer.同向雙指針與滑動窗口._80_remove_duplicates_from_sorted_array_II;

public class Solution implements Solution_80 {
    @Override
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i-2]) {
                nums[i] = n;
                i++;
            }
        return i;
    }
}
