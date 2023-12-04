package _1_array.二維陣列及滾動陣列._119_pascal_triangle_II;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Solution_119 {
    @Override
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0) {
            List<Integer> firstList = new ArrayList<>();
            firstList.add(1);
            return firstList;
        }
        List<Integer> preList = getRow(rowIndex - 1);
        List<Integer> currentList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0 || i == rowIndex) {
                currentList.add(1);
                continue;
            }
            currentList.add(preList.get(i) + preList.get(i-1));
        }
        return currentList;
    }
}
