package _1_array.統計陣列中的元素._645_set_mismatch;

import java.util.HashMap;
import java.util.Map;

public class Solution implements Solution_645 {
    @Override
    public int[] findErrorNums(int[] nums) {
        Map<Integer, Integer> m =  new HashMap<>();
        int dup = 0;
        int[] output = new int[2];
        for (int i = 1; i <= nums.length; i++) {
            m.put(i, i);
        }
        for (int num : nums) {
            if (m.remove(num) != null) { continue; }
            dup = num;
        }
        output[0] = dup;
        for (Integer a: m.values()) {
            output[1] = a;
        }
        return output;
    }
}
