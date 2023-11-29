package _1_array.統計陣列中的元素._442_find_all_duplicates_in_an_array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Solution_442 solution = new Solution();
        List<Integer> output = solution.findDuplicates(nums);
        List<Integer> except = new ArrayList<>();
        except.add(2);
        except.add(3);
        assertEquals(except, output);
    }
}
