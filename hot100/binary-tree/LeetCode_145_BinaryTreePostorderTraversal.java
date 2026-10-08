// 145. 二叉树的后序遍历   (EASY)
// https://leetcode.cn/problems/binary-tree-postorder-traversal/
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
public class LeetCode_145_BinaryTreePostorderTraversal {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null) return list;
        TreeNode prev = null;
        TreeNode cur = root;
        Deque<TreeNode> deque = new LinkedList<>();
        while(cur!=null||!deque.isEmpty()){
            while(cur!=null){
                deque.push(cur);
                cur = cur.left;
            }
            TreeNode peek = deque.peek();
            if(peek.right == null || peek.right == prev){
                cur = deque.pop();
                prev = cur;
                list.add(cur.val);
                cur = null;
            }
            else  cur = peek.right;
        }
        return list;
    }
}
