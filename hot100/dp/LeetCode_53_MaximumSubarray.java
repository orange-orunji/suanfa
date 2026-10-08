// 53. 最大子数组和   (MEDIUM)
// https://leetcode.cn/problems/maximum-subarray/
// 标签: Array / Divide and Conquer / Dynamic Programming
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_53_MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length==1) return nums[0];
        int maxCount = nums[0],curCount = nums[0];
        for(int i = 1;i<nums.length;i++){
            curCount = Math.max(curCount+nums[i],nums[i]);
            maxCount = Math.max(curCount,maxCount);
        }
        return maxCount;
    }
}
