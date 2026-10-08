// 83. 删除排序链表中的重复元素   (EASY)
// https://leetcode.cn/problems/remove-duplicates-from-sorted-list/
// 标签: Linked List
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
public class LeetCode_83_RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if(head ==null||head.next==null) return head;
        if(head.val == head.next.val ){
            return deleteDuplicates(head.next);
        }else{
           head.next =  deleteDuplicates(head.next);
           return head;
        }
    }
   
}
