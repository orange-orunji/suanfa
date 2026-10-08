// 105. 从前序与中序遍历序列构造二叉树   (MEDIUM)
// https://leetcode.cn/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
// 标签: Tree / Array / Hash Table / Divide and Conquer / Binary Tree
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
public class LeetCode_105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if(preorder.length==0) return null;
        int target = preorder[0];
        TreeNode current = new TreeNode(target);
        for(int i =0;i<inorder.length;i++){
            if(inorder[i] == target){
                int[] inleft = Arrays.copyOfRange(inorder,0,i);
                int[] inright = Arrays.copyOfRange(inorder,i+1,inorder.length);

                int[] preleft = Arrays.copyOfRange(preorder,1,i+1);
                int[] preright = Arrays.copyOfRange(preorder,i+1,preorder.length);
                current.left = buildTree(preleft,inleft);
                current.right = buildTree(preright,inright);
                break;
            }
        }return current;
























        // if(preorder.length==0) return null;
        // int n1 = preorder[0];
        // TreeNode root = new TreeNode(n1);
        // for(int i = 0 ;i < inorder.length;i++){
        //     if(inorder[i]==n1){
        //         int[] inleft = Arrays.copyOfRange(inorder,0,i);
        //         int[] inright = Arrays.copyOfRange(inorder,i+1,inorder.length);

        //         int[] preleft = Arrays.copyOfRange(preorder,1,i+1);
        //         int[] preright = Arrays.copyOfRange(preorder,i+1,inorder.length);

        //         root.left = buildTree(preleft,inleft);
        //         root.right = buildTree(preright,inright);
        //         break;
        //     }
        // }
        // return root;
    }
}
