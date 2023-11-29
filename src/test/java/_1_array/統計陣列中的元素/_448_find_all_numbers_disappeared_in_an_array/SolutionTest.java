package _1_array.統計陣列中的元素._448_find_all_numbers_disappeared_in_an_array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        Solution_448 solution = new Solution();
        List<Integer> output = solution.findDisappearedNumbers(nums);
        List<Integer> except = new ArrayList<>();
        except.add(5);
        except.add(6);
        assertEquals(except, output);
    }
}
