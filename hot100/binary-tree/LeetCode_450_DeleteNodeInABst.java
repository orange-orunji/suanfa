// 450. 删除二叉搜索树中的节点   (MEDIUM)
// https://leetcode.cn/problems/delete-node-in-a-bst/
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
public class LeetCode_450_DeleteNodeInABst {
    public TreeNode deleteNode(TreeNode node, int key) {
        if(node == null) return null;
        if(key<node.val){
            node.left = deleteNode(node.left,key);
            return node;
        }
        if(node.val<key){
            node.right = deleteNode(node.right,key);
            return node;
        }
        if(node.left==null) {
            return node.right;
            }
        if(node.right ==null) {
            return node.left;
        }
        TreeNode curr = node.right;
        while (curr.left!= null) {
            curr = curr.left;
        }
        curr.right = deleteNode(node.right,curr.val);
        curr.left = node.left;
        return curr;
    }
}
