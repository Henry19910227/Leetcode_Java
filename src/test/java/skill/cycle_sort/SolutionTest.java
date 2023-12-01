package skill.cycle_sort;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {3, 1, 5, 2, 4};
        CyclicSort sort = new Sort();
        sort.sort(nums);
        int[] except = {1, 2, 3, 4, 5};
        assertArrayEquals(except, nums);
    }
}
