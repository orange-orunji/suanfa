// 704. 二分查找   (EASY)
// https://leetcode.cn/problems/binary-search/
// 标签: Array / Binary Search
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_704_BinarySearch {
    public int search(int[] arr, int target) {
        int i = 0,j=arr.length;
        while(j - i > 1){
            int m = (i+j)>>1;
            if(arr[m]>target) j = m;
            else i = m;
        }
        return arr[i] == target ? i : -1;
    }
}
