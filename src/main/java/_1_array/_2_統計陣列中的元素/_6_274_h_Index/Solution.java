package _1_array._2_統計陣列中的元素._6_274_h_Index;

import java.util.Arrays;

public class Solution implements Solution_274 {
    @Override
    public int hIndex(int[] citations) {
        int[] arr = new int[citations.length+1];
        for (int i = 0; i < citations.length; i ++) {
            if (citations[i] >= citations.length) {
                arr[citations.length]++;
                continue;
            }
            arr[citations[i]]++;
        }
        int count = 0;
        for (int i = citations.length; i >= 0; i--) {
            count += arr[i];
            if (count < i) {
                continue;
            }
            return i;
        }
        return 0;
    }
}
