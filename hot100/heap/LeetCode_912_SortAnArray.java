// 912. 排序数组   (MEDIUM)
// https://leetcode.cn/problems/sort-an-array/
// 标签: Array / Divide and Conquer / Bucket Sort / Counting Sort / Radix Sort / Sorting / Heap (Priority Queue) / Merge Sort
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_912_SortAnArray {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i : nums){
            queue.offer(i);
        }
        int index  = 0;
        while(!queue.isEmpty()){
            nums[index++] = (int)queue.poll();
        }
        return nums;
    }
}
