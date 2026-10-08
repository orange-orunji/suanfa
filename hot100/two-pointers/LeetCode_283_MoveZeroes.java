// 283. 移动零   (EASY)
// https://leetcode.cn/problems/move-zeroes/
// 标签: Array / Two Pointers
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_283_MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length,slow =  0,fast=0;
        while(fast<n){
            if(nums[fast]!=0){
                int temp = nums[fast];
                nums[fast] = nums[slow];
                nums[slow] = temp;
                slow++;
            }
            fast++;
        }
    }
}
