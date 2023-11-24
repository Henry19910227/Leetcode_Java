package _6_hash_map.哈希表的查找插入及删除._349_intersection_of_two_arrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        Solution_349 solution = new Solution();
        int[] output = solution.intersection(nums1, nums2);
        assertArrayEquals(new int[]{2}, output);
    }
}
