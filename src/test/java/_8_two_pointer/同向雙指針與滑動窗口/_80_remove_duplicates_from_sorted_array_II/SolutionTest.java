package _8_two_pointer.同向雙指針與滑動窗口._80_remove_duplicates_from_sorted_array_II;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {1,1,1,2,2,3};
        Solution_80 solution = new Solution();
        int output = solution.removeDuplicates(nums);
        assertEquals(5, output);
    }
}
