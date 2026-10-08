// 111. 二叉树的最小深度   (EASY)
// https://leetcode.cn/problems/minimum-depth-of-binary-tree/
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
public class LeetCode_111_MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if(root == null ) return 0;
        if(root.left == null && root.right == null ) return 1;
        return DFS(root);
    }
    int DFS(TreeNode root){
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        int depth = 1;
        while(!deque.isEmpty()){
            int size = deque.size();
            for(int i =0;i<size;i++){
                TreeNode poll = deque.poll();
                if(poll.left == null && poll.right==null){
                    return depth;
                }
                if(poll.left!=null) deque.add(poll.left);
                if(poll.right!=null) deque.add(poll.right);
            }
            depth++;
        }
        return depth;
    }
}
