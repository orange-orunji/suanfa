// 19. 删除链表的倒数第 N 个结点   (MEDIUM)
// https://leetcode.cn/problems/remove-nth-node-from-end-of-list/
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
public class LeetCode_19_RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode heads = new ListNode(0,head);
        ListNode slow = heads,fast = heads;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        }
        while(fast.next!=null&&fast!=null){
            fast=fast.next;
            slow = slow.next;
        }
        ListNode next = slow.next;
        slow.next = next.next;
        return heads.next;
    }
}
