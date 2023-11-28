package _1_array.統計陣列中的元素._697_degree_of_an_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[] input = {1,2,2,3,1,4,2};
        Solution_697 solution = new Solution();
        int output = solution.findShortestSubArray(input);
        assertEquals(6, output);
    }
}
