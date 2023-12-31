package _1_array._1_陣列的遍歷._3_414_third_maximum_number;

public class Solution implements Solution_414 {
    @Override
    public int thirdMax(int[] nums) {
        long first = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;
        for (int num : nums) {
            if (num == first || num == second || num == third) {
                continue;
            }
            if (num > first) {
                third = second;
                second = first;
                first = num;
                continue;
            }
            if (num > second) {
                third = second;
                second = num;
                continue;
            }
            if (num > third) {
                third = num;
            }
        }
        return third != Long.MIN_VALUE ? (int)third : (int)first;
    }
}
