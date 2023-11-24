package _7_greedy.陣列與貪婪算法._455_assign_cookies;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums1 = {1,2,3};
        int[] nums2 = {1,1};
        Solution_455 solution = new Solution();
        int output = solution.findContentChildren(nums1, nums2);
        assertEquals(1, output);
    }
}
