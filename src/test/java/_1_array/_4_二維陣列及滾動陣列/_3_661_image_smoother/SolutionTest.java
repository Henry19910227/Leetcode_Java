package _1_array._4_二維陣列及滾動陣列._3_661_image_smoother;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        int[][] input = {{100,200,100},{200,50,200},{100,200,100}};
        Solution_661 solution = new Solution();
        int[][] output = solution.imageSmoother(input);
        assertArrayEquals(new int[][]{{137,141,137},{141,138,141},{137,141,137}}, output);
    }
}
