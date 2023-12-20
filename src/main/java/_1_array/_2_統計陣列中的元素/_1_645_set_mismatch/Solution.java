package _1_array._2_統計陣列中的元素._1_645_set_mismatch;

import java.util.HashMap;
import java.util.Map;

public class Solution implements Solution_645 {
    @Override
    public int[] findErrorNums(int[] nums) {
        int[] arr = new int[nums.length];
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i] - 1] ++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                ans[0] = i + 1;
            }
            if (arr[i] == 0) {
                ans[1] = i + 1;
            }
        }
        return ans;
    }
}
