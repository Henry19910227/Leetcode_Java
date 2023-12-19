package _1_array.前綴與陣列._238_product_of_array_except_self;

public class Solution implements Solution_238 {
    @Override
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] suf = new int[nums.length];
        int[] ans = new int[nums.length];
        pre[0] = 1;
        suf[nums.length - 1] = 1;
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i-1] * nums[i-1];
        }
        for (int i = nums.length - 2; i >= 0; i--) {
            suf[i] = suf[i+1] * nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            ans[i] = pre[i] * suf[i];
        }
        return ans;
    }
}
