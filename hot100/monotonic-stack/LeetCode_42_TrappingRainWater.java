// 42. 接雨水   (HARD)
// https://leetcode.cn/problems/trapping-rain-water/
// 标签: Stack / Array / Two Pointers / Dynamic Programming / Monotonic Stack
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_42_TrappingRainWater {
    public int trap(int[] height) {
        int n = height.length;
        if(n==0) return 0;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n - 2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
            }

        int result = 0;
        for(int i = 0;i<n;i++){
            result += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return result;
    }
}
