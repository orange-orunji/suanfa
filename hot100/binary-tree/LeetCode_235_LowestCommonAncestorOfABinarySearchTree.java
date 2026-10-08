// 235. 二叉搜索树的最近公共祖先   (MEDIUM)
// https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-search-tree/
// 标签: Tree / Depth-First Search / Binary Search Tree / Binary Tree / 最近公共祖先 / Binary Lifting
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
 *     TreeNode(int x) { val = x; }
 * }
 */

public class LeetCode_235_LowestCommonAncestorOfABinarySearchTree {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curr = root;
        while(curr!=null){
            if(curr.val>p.val && curr.val > q.val) curr = curr.left;
            else if(curr.val < p.val && curr.val < q.val) curr = curr.right;
            else return curr;
            // if(curr.val>p.val && curr.val<=q.val) break;
            // else if(curr.val <= p.val && curr.val > q.val ) break;
            // else if(curr.val<q.val) curr = curr.right;
            // else curr = curr.left;
            // if(root.left == p || root == p && root.right == q) return p;
            // else if(root.left == q || root== q && root.right == p ) return q;
            
        }return null;
    }
}
