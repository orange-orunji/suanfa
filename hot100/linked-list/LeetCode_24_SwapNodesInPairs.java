// 24. 两两交换链表中的节点   (MEDIUM)
// https://leetcode.cn/problems/swap-nodes-in-pairs/
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
public class LeetCode_24_SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null||head.next==null) return head;
        ListNode heads = new ListNode(0,head);
        ListNode prev = heads;
        while(prev.next!=null&&prev.next.next!=null){
        ListNode cur = prev.next,next = cur.next;
            cur.next = next.next;
            next.next = cur;
            prev.next = next;
            prev = prev.next.next;
        }
        return heads.next;
    }
}
