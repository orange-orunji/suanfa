// 206. 反转链表   (EASY)
// https://leetcode.cn/problems/reverse-linked-list/
// 标签: Recursion / Linked List
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
public class LeetCode_206_ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        ListNode ahead = new ListNode(0,head),cur = head;
        while(cur.next!=null){
            ListNode next = cur.next;
            cur.next = next.next;
            next.next = ahead.next;
            ahead.next = next;
        }
        return ahead.next;
    }
}
