// 98. 验证二叉搜索树   (MEDIUM)
// https://leetcode.cn/problems/validate-binary-search-tree/
// 标签: Tree / Depth-First Search / Binary Search Tree / Binary Tree
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
public class LeetCode_98_ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if(root.left == null&& root.right == null ) return true;
        double prev = -Double.MAX_VALUE;
        TreeNode cur = root;
        Deque<TreeNode> deque = new LinkedList<>();
        while(cur!=null||!deque.isEmpty()){
            while(cur!=null){
                deque.push(cur);
                cur = cur.left;
            }
            cur = deque.pop();
            if(cur.val<=prev) return false;
            prev = cur.val;
            cur = cur.right;
        }
        return true;
    }
}
