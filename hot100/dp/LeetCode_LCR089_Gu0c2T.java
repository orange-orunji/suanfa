// LCR089. 打家劫舍   (MEDIUM)
// https://leetcode.cn/problems/Gu0c2T/
// 标签: Array / Dynamic Programming
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_LCR089_Gu0c2T {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(dp[0],nums[1]);
        for(int i = 2;i<nums.length;i++){
            dp[i] = Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return dp[nums.length-1];
    }
}
