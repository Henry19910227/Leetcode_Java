package _1_array.統計陣列中的元素._274_h_Index;

import java.util.Arrays;

public class Solution implements Solution_274 {
    @Override
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h = 0;
        for (int i = 0; i < citations.length; i++) {
            if (citations[citations.length - 1 - i] < i + 1) { break; }
            h++;
        }
        return h;
    }
}
