// 144. 二叉树的前序遍历   (EASY)
// https://leetcode.cn/problems/binary-tree-preorder-traversal/
// 标签: Stack / Tree / Depth-First Search / Binary Tree
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
public class LeetCode_144_BinaryTreePreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null)  return list;  
        Deque<TreeNode> deque = new LinkedList<>();
        TreeNode cur = root;
        while(cur!=null||!deque.isEmpty()){
            while(cur!=null){
                list.add(cur.val);
                deque.push(cur);
                cur = cur.left;
            }
            cur = deque.pop().right;
        }
        return list;
    }
}
