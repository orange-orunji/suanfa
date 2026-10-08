// 26. 删除有序数组中的重复项   (EASY)
// https://leetcode.cn/problems/remove-duplicates-from-sorted-array/
// 标签: Array / Two Pointers
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_26_RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        while(j < n){
            if(nums[j] > nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}
