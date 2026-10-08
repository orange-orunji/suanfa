// 34. 在排序数组中查找元素的第一个和最后一个位置   (MEDIUM)
// https://leetcode.cn/problems/find-first-and-last-position-of-element-in-sorted-array/
// 标签: Array / Binary Search
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_34_FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] a, int target) {
        int m = left(a,target);
        if(m == -1){
            return new int[]{-1,-1};
        }else{
            return new int[]{m, right(a,target)};
        }
       
    }
    public int left(int[] a , int target){
        int i = 0, j = a.length -1 ,candidate = -1; 
        while(i <= j ){
            int m = (i+j)>>>1;
            if(a[m] < target) i = m + 1 ;
            else if(a[m]> target) j = m - 1 ;
            else {
                candidate = m ;
                j = m -1 ;
            }
        }return candidate;
        
    }public int right(int[] a , int target){
        int i = 0, j = a.length -1 ,candidate = -1; 
        while(i <= j ){
            int m = (i+j)>>>1;
            if(a[m] < target) i = m + 1 ;
            else if(a[m]> target) j = m - 1 ;
            else {
                candidate = m ;
                i = m + 1 ;
            }
        }return candidate;
        
    }
}
