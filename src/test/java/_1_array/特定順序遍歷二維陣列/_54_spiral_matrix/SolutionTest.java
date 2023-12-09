package _1_array.特定順序遍歷二維陣列._54_spiral_matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    void test() {
        Solution_54 solution = new Solution();

        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> output1 = solution.spiralOrder(input1);
        Integer[] except1 = {1,2,3,6,9,8,7,4,5};
        assertEquals(Arrays.asList(except1), output1);

        int[][] input2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> output2 = solution.spiralOrder(input2);
        Integer[] except2 = {1,2,3,4,8,12,11,10,9,5,6,7};
        assertEquals(Arrays.asList(except2), output2);

        /** 1  2  3  4
         5  6  7  8
         9  10 11 12
         13 14 15 16 */
        int[][] input3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
        List<Integer> output3 = solution.spiralOrder(input3);
        Integer[] except3 = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
        assertEquals(Arrays.asList(except3), output3);
    }
    @Test
    void test1() {
        Solution_54 solution = new Solution1();

        int[][] input1 = {{1,2,3},{4,5,6},{7,8,9}};
        List<Integer> output1 = solution.spiralOrder(input1);
        Integer[] except1 = {1,2,3,6,9,8,7,4,5};
        assertEquals(Arrays.asList(except1), output1);

        int[][] input2 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> output2 = solution.spiralOrder(input2);
        Integer[] except2 = {1,2,3,4,8,12,11,10,9,5,6,7};
        assertEquals(Arrays.asList(except2), output2);

        /** 1  2  3  4
            5  6  7  8
            9  10 11 12
            13 14 15 16 */
        int[][] input3 = {{1,2,3,4},{5,6,7,8},{9,10,11,12}, {13,14,15,16}};
        List<Integer> output3 = solution.spiralOrder(input3);
        Integer[] except3 = {1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10};
        assertEquals(Arrays.asList(except3), output3);
    }
}
