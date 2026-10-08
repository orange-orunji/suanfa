// 1008. 前序遍历构造二叉搜索树   (MEDIUM)
// https://leetcode.cn/problems/construct-binary-search-tree-from-preorder-traversal/
// 标签: Stack / Tree / Binary Search Tree / Array / Binary Tree / Monotonic Stack
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
public class LeetCode_1008_ConstructBinarySearchTreeFromPreorderTraversal {
    public TreeNode bstFromPreorder(int[] preorder) {
        return insert(preorder,0,preorder.length-1);

    }
    private TreeNode insert(int[] preorder,int start ,int end){
        if(start>end) return null;
        int index = start +1 ;
        while(index<=end){
            if(preorder[index] > preorder[start]) break;
            index++;
        }
        TreeNode curr = new TreeNode(preorder[start]);
        curr.left = insert(preorder,start+1,index-1);
        curr.right = insert(preorder,index,end);
        return curr;




















        // if(start>end){
        //     return null;
        // }
        // int index = start + 1;
        // while(index<=end){
        //     if(preorder[index]>preorder[start]) {
        //     break;
        //     } 
        //     index++;
        // }
        // TreeNode curr = new TreeNode(preorder[start]);
        // curr.left = insert(preorder,start+1,index-1);
        // curr.right = insert(preorder,index,end);
        // return curr;
    }
}
