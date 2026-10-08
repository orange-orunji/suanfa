// LCR024. 反转链表   (EASY)
// https://leetcode.cn/problems/UHnkqh/
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
public class LeetCode_LCR024_UHnkqh {
    public ListNode reverseList(ListNode head) {
        if(head == null) return null;
        ListNode heads = new ListNode(0,head);
        ListNode tail = heads.next,next;
        while(tail.next!=null){
            next = tail.next;
            tail.next = next.next;
            next.next = heads.next;
            heads.next= next;
        }
        return heads.next;
    }
}
