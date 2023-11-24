package _6_hash_map.哈希表的查找插入及删除._349_intersection_of_two_arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution implements Solution_349 {
    @Override
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> m = new HashMap<>();
        Map<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            m.put(nums1[i], nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            Integer a = m.remove(nums2[i]);
            if (a != null) {
                ans.put(a, a);
            }
        }
        int[] nums = new int[ans.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : ans.entrySet()) {
            nums[i++] = entry.getValue();
        }
        return nums;
    }
}
