package _1_array._2_統計陣列中的元素._5_41_first_missing_positive;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] input1 = {3,4,-1,1};
        int[] input2 = {1,1};
        Solution_41 solution = new Solution();

        int output = solution.firstMissingPositive(input1);
        assertEquals(2, output);

        output = solution.firstMissingPositive(input2);
        assertEquals(2, output);
    }
    @Test
    void test1() {
        int[] input = {3,4,-1,1};
        Solution_41 solution = new Solution1();
        int output = solution.firstMissingPositive(input);
        assertEquals(2, output);
    }
}
