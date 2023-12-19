package _1_array._4_二維陣列及滾動陣列._1_118_pascal_triangle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int input = 5;
        Solution_118 solution = new Solution();
        List<List<Integer>> output = solution.generate(input);
        List<List<Integer>> except = new ArrayList<>();
        Integer[][] nums = {{1}, {1,1}, {1,2,1}, {1, 3, 3, 1}, {1, 4, 6, 4, 1}};
        for (Integer[] item: nums) {
            except.add(List.of(item));
        }
        assertEquals(except, output);
    }
}
