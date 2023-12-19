package _1_array._4_二維陣列及滾動陣列._2_119_pascal_triangle_II;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle-ii/
public class Solution_best implements Solution_119 {
    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        long start = 1;
        list.add((int)start);  // Add 1 to the list (the first element in any row is always 1)

        for (int i = 0; i < rowIndex; i++) {
            start *= (rowIndex - i);  // Update start by multiplying it with (5 - i)
            start = (start / (i + 1));  // Update start by dividing it by (i + 1) and cast to int
            list.add((int)start);  // Add the current value of start to the list
        }
        return list;
    }
}
