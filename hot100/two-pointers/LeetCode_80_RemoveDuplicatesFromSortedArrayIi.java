// 80. 删除有序数组中的重复项 II   (MEDIUM)
// https://leetcode.cn/problems/remove-duplicates-from-sorted-array-ii/
// 标签: Array / Two Pointers
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_80_RemoveDuplicatesFromSortedArrayIi {
    public int removeDuplicates(int[] nums) {
        
        int n = nums.length;
        if(n <=1) return n;
        int slow = 2,fast =2;
        while( fast < n ){
            if(nums[fast] != nums[slow -2]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
