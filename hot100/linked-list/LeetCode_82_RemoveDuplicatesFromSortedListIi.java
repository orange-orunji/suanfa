// 82. 删除排序链表中的重复元素 II   (MEDIUM)
// https://leetcode.cn/problems/remove-duplicates-from-sorted-list-ii/
// 标签: Linked List / Two Pointers
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
public class LeetCode_82_RemoveDuplicatesFromSortedListIi {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode s = new ListNode(-1,head);
        ListNode s1 = s;
        ListNode s2,s3;
        while(s1.next != null){
            s2 = s1.next;
            s3 =s2.next;
            if(s3 != null && s3.val == s2.val){
                while(s3!= null && s3.val == s2.val){
                    s3 = s3.next;
                }
                s1.next = s3;
            }else{
                s1 = s1.next;
            }
        }return s.next;
    }
}
