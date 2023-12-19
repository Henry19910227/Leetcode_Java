package _1_array._1_陣列的遍歷._2_495_teemo_attacking;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] input = {1,4};
        int duration = 2;
        Solution_495 solution = new Solution();
        int output = solution.findPoisonedDuration(input, duration);
        assertEquals(4, output);
    }
}
