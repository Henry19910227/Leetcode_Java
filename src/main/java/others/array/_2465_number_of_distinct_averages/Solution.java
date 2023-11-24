package others.array._2465_number_of_distinct_averages;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution implements Solution_2465 {
    @Override
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);
        Map<Float,Float> map = new HashMap<>();
        int j = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            if (i > j) { break; }
            float avg = (float)(nums[i] + nums[j]) / 2;
            map.put(avg, avg);
            j--;
        }
        return map.size();
    }
}
