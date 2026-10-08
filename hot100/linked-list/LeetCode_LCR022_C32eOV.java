// LCR022. 环形链表 II   (MEDIUM)
// https://leetcode.cn/problems/c32eOV/
// 标签: Hash Table / Linked List / Two Pointers
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LeetCode_LCR022_C32eOV {
    public ListNode detectCycle(ListNode head) {
        if(head == null||head.next == null) return null;
        ListNode fast = head,slow = head;
        while(fast != null && fast.next != null ){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        if(fast == null || fast.next == null ) return null;
        fast = head;
        while(slow!=fast){
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
