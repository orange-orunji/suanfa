// 35. 搜索插入位置   (EASY)
// https://leetcode.cn/problems/search-insert-position/
// 标签: Array / Binary Search
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_35_SearchInsertPosition {
    public int searchInsert(int[] arr, int target) {
       int i = 0 , j = arr.length - 1 ;
       while(i <= j ){
        int m = (i+ j )>>>1;
        if(arr[m] < target) i = m + 1 ;
        else  j = m - 1 ;
       }return i ;
    }
}
