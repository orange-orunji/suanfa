// 703. 数据流中的第 K 大元素   (EASY)
// https://leetcode.cn/problems/kth-largest-element-in-a-stream/
// 标签: Tree / Design / Binary Search Tree / Binary Tree / Data Stream / Heap (Priority Queue)
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_703_KthLargestElementInAStream {
    private PriorityQueue<Integer> minHeap;
    int k ;
    public LeetCode_703_KthLargestElementInAStream(int k, int[] nums) {
        this.k = k ;
      minHeap = new PriorityQueue<Integer>(k);
      for(int i : nums){
       add(i);
      }
    }
    public int add(int val) {
        minHeap.offer(val);
       if(minHeap.size()>k) minHeap.poll();
       return minHeap.peek();
    }
}
