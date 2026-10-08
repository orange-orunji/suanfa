// LCR023. 相交链表   (EASY)
// https://leetcode.cn/problems/3u1WK4/
// 标签: Hash Table / Linked List / Two Pointers
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
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class LeetCode_LCR023_3u1WK4 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA,b = headB;
        while(a != b){
            a = a==null?headB:a.next;
            b = b==null?headA:b.next;
        }
        return a;
    }
}
