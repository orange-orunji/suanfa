// 94. 二叉树的中序遍历   (EASY)
// https://leetcode.cn/problems/binary-tree-inorder-traversal/
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
public class LeetCode_94_BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
            if(root == null) return list;
            doinorderTraversal(root,list);
            return list;
    }
    void doinorderTraversal(TreeNode cur,List<Integer> list){
        if(cur == null) return ;
        doinorderTraversal(cur.left,list);
        list.add(cur.val);
        doinorderTraversal(cur.right,list);
    }
}
