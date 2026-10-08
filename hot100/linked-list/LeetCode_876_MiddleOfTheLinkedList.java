// 876. 链表的中间结点   (EASY)
// https://leetcode.cn/problems/middle-of-the-linked-list/
// 标签: Linked List / Two Pointers
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
public class LeetCode_876_MiddleOfTheLinkedList {
    public ListNode middleNode(ListNode head) {
        if(head.next == null) return head;
        ListNode heads = new ListNode(0,head);
        ListNode slow = heads,fast = heads;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow = slow.next;
        }   
        if(fast!=null){
            slow = slow.next;
        }
        return slow;
    }
}
