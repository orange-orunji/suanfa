// 88. 合并两个有序数组   (EASY)
// https://leetcode.cn/problems/merge-sorted-array/
// 标签: Array / Two Pointers / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_88_MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newNum = new int[m + n];
        int temp1 = 0, temp2 = 0, index = 0;
        while (temp1 < m && temp2 < n) {
            if (nums1[temp1] <= nums2[temp2]) {
                newNum[index++] = nums1[temp1++];
            } else {
                newNum[index++] = nums2[temp2++];
            }
        }
        if (temp1 == m) {
            while (temp2 < n) {
                newNum[index++] = nums2[temp2++];
            }
        } else {
            while (temp1 < m) {
                newNum[index++] = nums1[temp1++];
            }
        }
        System.arraycopy(newNum,0,nums1,0,newNum.length);
    }
}
