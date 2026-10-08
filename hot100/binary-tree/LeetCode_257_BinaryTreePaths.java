// 257. 二叉树的所有路径   (EASY)
// https://leetcode.cn/problems/binary-tree-paths/
// 标签: Tree / Depth-First Search / String / Backtracking / Binary Tree
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
public class LeetCode_257_BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> lists = new LinkedList<>();
        doDinary(root,new StringBuilder(),lists);
        return lists;
    }
    void doDinary(TreeNode cur,StringBuilder list,List<String> lists){
        if(cur==null) return;
        StringBuilder sb = new StringBuilder(list);
        sb.append(cur.val);
        if(cur.left == null && cur.right == null){
            lists.add(sb.toString());
        }
        else{
            sb.append("->");
            doDinary(cur.left,sb,lists);
            doDinary(cur.right,sb,lists);
        }
    }
}
