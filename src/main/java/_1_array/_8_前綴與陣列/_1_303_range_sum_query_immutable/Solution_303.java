package _1_array._8_前綴與陣列._1_303_range_sum_query_immutable;

// https://leetcode.com/problems/range-sum-query-immutable/descrip
// [1,2,3,4,5]
// [0] = 1, [1] = 1+2, [2] = 1+2=3, [3] = 1+2+3+4, [4] = 1+2+3+4+5
public interface Solution_303 {
    int sumRange(int left, int right);
}
