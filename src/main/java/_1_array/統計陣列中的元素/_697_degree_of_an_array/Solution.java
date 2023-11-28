package _1_array.統計陣列中的元素._697_degree_of_an_array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution implements Solution_697 {
    @Override
    public int findShortestSubArray(int[] nums) {
        // current[0] 重複數量
        // current[1] 該數字最左邊的index
        // current[2] 該數字最右邊的index
        int[] current = new int[]{0, 0, nums.length - 1};
        Map<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int[] arr = map.get(nums[i]);
            if (arr == null) {
                arr = new int[]{0, i, nums.length - 1};
            }
            arr[0] ++;
            arr[2] = i;
            map.put(nums[i], arr);
            // 如果重複數量大於 current 或 重複數量等於 current 但 index 距離小於 current 則 取代 current
            if (arr[0] > current[0] || (arr[0] == current[0] && arr[2] - arr[1] < current[2] - current[1])) {
                current = arr;
            }
        }
        return current[2] - current[1] + 1;
    }
}
