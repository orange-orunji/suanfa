// 102. 二叉树的层序遍历   (MEDIUM)
// https://leetcode.cn/problems/binary-tree-level-order-traversal/
// 标签: Tree / Breadth-First Search / Binary Tree
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
public class LeetCode_102_BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if(root == null) return lists;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int count = deque.size();
            List list = new LinkedList<>();
            for(int i =0;i<count;i++){
            TreeNode poll = deque.poll();
            list.add(poll.val);
            if(poll.left!=null) deque.offer(poll.left);
            if(poll.right!=null) deque.offer(poll.right);
            }
            lists.add(list);
        }
        return lists;
    }
}
