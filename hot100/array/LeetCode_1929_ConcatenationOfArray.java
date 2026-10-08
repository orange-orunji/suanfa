// 1929. 数组串联   (EASY)
// https://leetcode.cn/problems/concatenation-of-array/
// 标签: Array / Simulation
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_1929_ConcatenationOfArray {
    public int[] getConcatenation(int[] nums) {
        int[] ans = new int[2*nums.length];
    System.arraycopy(nums,0,ans,0,nums.length);
    System.arraycopy(nums,0,ans,nums.length,nums.length);
    return ans;
    }
}
