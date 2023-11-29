package _1_array.統計陣列中的元素._442_find_all_duplicates_in_an_array;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Solution_442 {
    @Override
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num: nums) {
            int index = Math.abs(num);
            if (nums[index - 1] > 0) {
                nums[index - 1] *= -1;
                continue;
            }
            list.add(index);
        }
        return list;
    }
}
