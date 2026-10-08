// 104. 二叉树的最大深度   (EASY)
// https://leetcode.cn/problems/maximum-depth-of-binary-tree/
// 标签: Tree / Depth-First Search / Breadth-First Search / Binary Tree
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
public class LeetCode_104_MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int maxDep = 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.push(root);
        while(!deque.isEmpty()){
            int count = deque.size();
            for(int i =0;i<count;i++){
            TreeNode poll = deque.poll();
            if(poll.left!=null) deque.add(poll.left);
            if(poll.right!=null) deque.add(poll.right);
            }
            maxDep++;
        }
        return maxDep;
    }
}
