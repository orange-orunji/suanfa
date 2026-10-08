// 700. 二叉搜索树中的搜索   (EASY)
// https://leetcode.cn/problems/search-in-a-binary-search-tree/
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
public class LeetCode_700_SearchInABinarySearchTree {
    public TreeNode searchBST(TreeNode root, int val) {
        return doSearchBST(root,val);
    }
    TreeNode doSearchBST(TreeNode cur,int target){
        if(cur == null) return null;
        if(cur.val>target) return doSearchBST(cur.left,target);
        else if(cur.val<target) return doSearchBST(cur.right,target);
        else return cur;
    }
}
