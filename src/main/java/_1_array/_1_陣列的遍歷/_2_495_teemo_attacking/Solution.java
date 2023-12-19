package _1_array._1_陣列的遍歷._2_495_teemo_attacking;

public class Solution implements Solution_495 {
    @Override
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total = 0;
        for (int i = 0; i < timeSeries.length; i ++) {
            if (i == timeSeries.length - 1) {
                total += duration;
                continue;
            }
            int time = Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
            total += time;
        }
        return total;
    }
}
