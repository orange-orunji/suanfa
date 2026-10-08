// 23. 合并 K 个升序链表   (HARD)
// https://leetcode.cn/problems/merge-k-sorted-lists/
// 标签: Linked List / Divide and Conquer / Heap (Priority Queue) / Merge Sort / 锦标赛排序
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class LeetCode_23_MergeKSortedLists {
    public ListNode mergeKLists(ListNode[] lists) {
       ListNode[] list ;
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        PriorityQueue2 pd = new PriorityQueue2(lists.length);
        for (ListNode n : lists) {
            if(n != null)  {
                pd.offer(n);
            }
        }
        while (!pd.isEmpty()){
            ListNode min = pd.poll();
            tail.next = min;
            tail = min;
            if(min.next!=null){
                pd.offer(min.next);
            }
        }return head.next;
    }
    
   static class PriorityQueue2 {
    ListNode[] list;
    int capacity;
    int size = 0;

    public PriorityQueue2(int capacity) {
        this.capacity = capacity;
        list = new ListNode[capacity];
    }

    public boolean offer(ListNode added) {
        if(isFull()) return false;
        int child = size;
        int parent = (child -1)/2;
        while (child>0&& added.val<list[parent].val){
            list[child] = list[parent];
            child = parent;
            parent = (child -1)/2;
        }
        list[child] = added;
        size++;
        return true;
    }

    public ListNode poll() {
        if(isEmpty()) return null;
        change(0,size-1);
        ListNode value = list[size-1];
        list[size-1] = null;
        size--;
        down(0);
        return value;
    }
    public void down(int parent){
        while (true) {
            int left  = parent * 2 + 1;
            int right = parent *2+2;
            int max = parent;
            if(left < size &&list[left].val<list[max].val) max = left;
            if(right<size && list[right].val<list[max].val) max = right;
            if(max == parent) break;
            change(parent,max);
            parent = max;
        }
    }

    public void change(int i ,int j){
        ListNode temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}

}
