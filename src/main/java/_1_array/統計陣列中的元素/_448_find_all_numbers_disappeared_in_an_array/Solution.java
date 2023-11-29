package _1_array.統計陣列中的元素._448_find_all_numbers_disappeared_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Solution_448 {
    @Override
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num: nums) {
            int index = Math.abs(num);
            if (nums[index - 1] < 0) { continue; }
            nums[index - 1] *= -1;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) { continue; }
            list.add(i + 1);
        }
        return list;
    }
}
