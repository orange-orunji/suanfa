// 203. 移除链表元素   (EASY)
// https://leetcode.cn/problems/remove-linked-list-elements/
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
public class LeetCode_203_RemoveLinkedListElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode snetial = new ListNode(-1,head);
        ListNode s1 = snetial;
        ListNode s2 ;
        while((s2 = s1.next) != null){
            if(s2.val == val){
                s1.next = s2.next;
            }else{
                s1 = s1.next;
            }
        }return snetial.next;




        // if(head == null) return head;
        // if(head.val == val){
        //     return removeElements(head.next,val);
        // }else{
        //     head.next = removeElements(head.next,val);
        //     return head;
        // }
    }
}
