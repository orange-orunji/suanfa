// 27. 移除元素   (EASY)
// https://leetcode.cn/problems/remove-element/
// 标签: Array / Two Pointers
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_27_RemoveElement {
    public int removeElement(int[] nums, int val) {
        int left = 0, right = 0, n = nums.length;
        for(;right<n;right++){
            if(nums[right]!=val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }
}
