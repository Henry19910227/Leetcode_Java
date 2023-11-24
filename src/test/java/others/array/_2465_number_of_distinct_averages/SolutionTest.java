package others.array._2465_number_of_distinct_averages;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {4,1,4,0,3,5};
        Solution_2465 solution = new Solution();
        int output = solution.distinctAverages(nums);
        assertEquals(2, output);
    }
}
