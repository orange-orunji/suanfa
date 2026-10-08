// 11. 盛最多水的容器   (MEDIUM)
// https://leetcode.cn/problems/container-with-most-water/
// 标签: Greedy / Array / Two Pointers
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_11_ContainerWithMostWater {
    public int maxArea(int[] height) {
        int left = 0,right = height.length-1,max=0;
        while(left<right){
            max = Math.max(max,Math.min(height[left],height[right])*(right-left));
            if(height[left]<height[right]){
                left++;
            }else
                right--;
        }
        return max;
    }
}
