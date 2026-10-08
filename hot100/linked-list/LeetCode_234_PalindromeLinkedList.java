// 234. 回文链表   (EASY)
// https://leetcode.cn/problems/palindrome-linked-list/
// 标签: Stack / Recursion / Linked List / Two Pointers
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
public class LeetCode_234_PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode ahead = new ListNode(0),slow = head,fast = head;
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;

            ListNode next = slow.next;
            slow.next = ahead.next;
            ahead.next = slow;
            slow = next;
        }
        if(fast!=null){
            slow = slow.next;
        }
        ListNode cur = ahead.next;
        while(slow!=null){
            if(slow.val!=cur.val){
                return false;
            }
            slow = slow.next;
            cur = cur.next;
        }
        return true;
    }
}
