// 21. 合并两个有序链表   (EASY)
// https://leetcode.cn/problems/merge-two-sorted-lists/
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
public class LeetCode_21_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ahead = new ListNode(0,null);
        ListNode head = ahead;
        while(list1!=null&list2!=null){
            if(list1.val<list2.val){
                ListNode next = list1.next;
                head.next = list1;
                list1 = next;
            }else{
                ListNode next = list2.next;
                head.next =  list2;
                list2 = next;
            }
            head = head.next;
        }
        if(list1==null){
            head.next = list2;
        }else{
            head.next = list1;
        }
        return ahead.next;
    }
}
