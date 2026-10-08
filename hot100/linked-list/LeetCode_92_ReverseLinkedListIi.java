// 92. 反转链表 II   (MEDIUM)
// https://leetcode.cn/problems/reverse-linked-list-ii/
// 标签: Linked List
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
public class LeetCode_92_ReverseLinkedListIi {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode heads = new ListNode(0,head);
        ListNode prev = heads,cur = heads.next,next;
        for(int i = 1;i < right;i++){
            if(i<left){
                cur = cur.next;
                prev = prev.next;
            }else{
                next = cur.next;
                cur.next = next.next;
                next.next = prev.next;
                prev.next = next;
            }
        }
        return heads.next;
    }
}
