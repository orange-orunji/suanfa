// 141. 环形链表   (EASY)
// https://leetcode.cn/problems/linked-list-cycle/
// 标签: Hash Table / Linked List / Two Pointers / Floyd 判圈算法
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
public class LeetCode_141_LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;

        ListNode slow = head, fast = head;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow)
                return true;
        }
        return false;
    }
}
