// 2. 两数相加   (MEDIUM)
// https://leetcode.cn/problems/add-two-numbers/
// 标签: Recursion / Linked List / Math
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
public class LeetCode_2_AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ahead = new ListNode(0,null);
        ListNode cur = ahead;
        boolean add_num = false;
        while(l1!=null&&l2!=null){
            cur.next = new ListNode(l1.val+l2.val+(add_num==true?1:0),null);
            cur = cur.next;
            add_num = false;
            if(cur.val>9){
                cur.val %= 10;
                add_num = true;
            }
            l1=l1.next;
            l2=l2.next;
        }
        if(l1==null){
            cur.next = l2;
        }else
            cur.next = l1;
        while(cur.next!=null){
            cur = cur.next;
            if(add_num){
                cur.val++;
                add_num = false;
            }
            if(cur.val>9){
                cur.val %=10;
                add_num = true;
            }
        }
        if(add_num){
            cur.next = new ListNode(1,null);
        }
        return ahead.next;
    }
}
