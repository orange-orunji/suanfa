// 404. 左叶子之和   (EASY)
// https://leetcode.cn/problems/sum-of-left-leaves/
// 标签: Tree / Depth-First Search / Breadth-First Search / Binary Tree
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class LeetCode_404_SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root.left == null && root.right == null) return 0;
        int result = 0;
        TreeNode cur = root;
        Deque<TreeNode> deque = new LinkedList<>();
        while(cur!=null||!deque.isEmpty()){
            while(cur!=null){
                deque.push(cur);
                cur = cur.left;
                if(cur!=null&&cur.left == null&&cur.right == null) result += cur.val;
            }
            cur = deque.pop().right;
        }
        return result;
    }
}
