package _7_greedy.陣列與貪婪算法._455_assign_cookies;

import java.util.Arrays;

public class Solution implements Solution_455 {
    @Override
    public int findContentChildren(int[] g, int[] s) {
        int i = 0;
        int j = 0;
        int output = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (i <= g.length - 1 && j <= s.length - 1) {
            if (g[i] <= s[j]) {
                output++;
                i++;
                j++;
                continue;
            }
            j++;
        }
        return output;
    }
}
