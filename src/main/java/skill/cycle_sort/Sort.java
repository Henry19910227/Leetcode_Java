package skill.cycle_sort;

public class Sort implements CyclicSort {
    @Override
    public void sort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if (nums[i] != i + 1) {
                int num = nums[i];
                nums[i] = nums[num - 1];
                nums[num - 1] = num;
                continue;
            }
            i++;
        }
    }
}
