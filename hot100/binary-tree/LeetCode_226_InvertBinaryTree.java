// 226. 翻转二叉树   (EASY)
// https://leetcode.cn/problems/invert-binary-tree/
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
public class LeetCode_226_InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            TreeNode poll = deque.poll();
            TreeNode temp = poll.left;
            poll.left = poll.right;
            poll.right = temp ;
            if(poll.left!=null) deque.offer(poll.left);
            if(poll.right !=null) deque.offer(poll.right);
        }
        return root;
    }
}
