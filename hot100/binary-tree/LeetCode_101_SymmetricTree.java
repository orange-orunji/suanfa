// 101. 对称二叉树   (EASY)
// https://leetcode.cn/problems/symmetric-tree/
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
public class LeetCode_101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return doIs(root.left,root.right);
    }
    boolean doIs(TreeNode left,TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val!=right.val) return false;
        return doIs(left.left,right.right)&&doIs(left.right,right.left);
    }
}
