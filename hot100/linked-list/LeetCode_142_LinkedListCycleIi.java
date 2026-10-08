// 142. 环形链表 II   (MEDIUM)
// https://leetcode.cn/problems/linked-list-cycle-ii/
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
public class LeetCode_142_LinkedListCycleIi {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next ==null) return null;
        ListNode slow = head,fast = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast)   break;
        }
        if(fast!=slow) return null;
        fast = head;
        while(fast!=slow){
            slow = slow.next;
            fast = fast.next;
        }
        return slow ;
    }
}
