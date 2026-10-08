// 938. 二叉搜索树的范围和   (EASY)
// https://leetcode.cn/problems/range-sum-of-bst/
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
public class LeetCode_938_RangeSumOfBst {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;
        if(root.val<low) return rangeSumBST(root.right,low,high);
        if(root.val>high) return rangeSumBST(root.left,low,high);

        return root.val+rangeSumBST(root.left,low,high)+rangeSumBST(root.right,low,high);
        // //非递归实现  中序遍历
        // if(root == null ) return 0;
        // int sum = 0;
        // LinkedList<TreeNode> stack = new LinkedList<>();
        // while(root!=null||!stack.isEmpty()){
        //     while(root!=null){
        //         stack.push(root);
        //         root = root.left;
        //     }
        //         root = stack.pop();
        //         if(root.val>=low&&root.val<=high) sum+=root.val;
        //         else if(root.val>high) break;
        //         root = root.right;
            
        // }
        // return sum;
    }
}
