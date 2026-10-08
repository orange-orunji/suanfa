// 701. 二叉搜索树中的插入操作   (MEDIUM)
// https://leetcode.cn/problems/insert-into-a-binary-search-tree/
// 标签: Tree / Binary Search Tree / Binary Tree
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
public class LeetCode_701_InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null) {
            root = new TreeNode(val);
            return root;
        }
        if(val<root.val){
            root.left = insertIntoBST(root.left,val);
        }else if(root.val<val){
            root.right = insertIntoBST(root.right,val);
            
        }
        return root;
    }
}
