package _1_array.二維陣列及滾動陣列._118_pascal_triangle;

import java.util.ArrayList;
import java.util.List;

public class Solution implements Solution_118 {
    @Override
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<List<Integer>> list = new ArrayList<>();
            list.add(row);
            return list;
        }
        List<List<Integer>> preList = generate(numRows-1);
        List<Integer> row = new ArrayList<>();
        List<Integer> preRow = preList.get(numRows-2);
        for (int i = 0; i < numRows; i++) {
            if (i == 0 || i == numRows - 1) {
                row.add(1);
                continue;
            }
            row.add(preRow.get(i) + preRow.get(i-1));
        }
        preList.add(row);
        return preList;
    }
}
