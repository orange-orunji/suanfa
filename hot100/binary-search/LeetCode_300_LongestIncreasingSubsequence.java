// 300. 最长递增子序列   (MEDIUM)
// https://leetcode.cn/problems/longest-increasing-subsequence/
// 标签: Array / Binary Search / Dynamic Programming / 最长上升子序列
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_300_LongestIncreasingSubsequence {
    public int lengthOfLIS(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        for(int i = 1;i<nums.length;i++){
            for(int j =0;j<i;j++){
                if(nums[i]>nums[j]) dp[i] = Math.max(dp[i],dp[j]+1);
            }
        }
        int max = dp[0];
        for(int i = 1; i< nums.length;i++){
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
