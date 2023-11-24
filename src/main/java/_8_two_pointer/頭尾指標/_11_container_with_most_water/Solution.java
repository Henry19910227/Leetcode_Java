package _8_two_pointer.頭尾指標._11_container_with_most_water;

public class Solution implements Solution_11 {
    @Override
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;
        while (left < right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, area);
            if (height[left] < height[right]) {
                left++;
                continue;
            }
            right--;
        }
        return maxArea;
    }
}
