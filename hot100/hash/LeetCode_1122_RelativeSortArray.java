// 1122. 数组的相对排序   (EASY)
// https://leetcode.cn/problems/relative-sort-array/
// 标签: Array / Hash Table / 冒泡排序 / Counting Sort / Sorting / 快速排序
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_1122_RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if(arr1.length<=1) return arr1;
        int[] counts = new int[1001];
        for(int i : arr1){
            counts[i]++;
        }
        int index = 0;
        for(int i: arr2){
            while(counts[i]!=0){
                arr1[index++] = i;
                counts[i]--;
            }
        }
        for(int i=0;i<counts.length;i++){
            while(counts[i]!=0){
                arr1[index++] = i;
                counts[i]--;
            }
            
        }
        return arr1;
    }
}
