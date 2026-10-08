// 103. 二叉树的锯齿形层序遍历   (MEDIUM)
// https://leetcode.cn/problems/binary-tree-zigzag-level-order-traversal/
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
public class LeetCode_103_BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> lists = new LinkedList<>();
        if(root == null) return lists;
        int depth = 1;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int size = deque.size();
            List<Integer> list = new ArrayList<>();
            if(depth%2==1){
                for(int i =0;i<size;i++){
                    TreeNode poll = deque.pollFirst();
                    list.add(poll.val);
                    if(poll.left!=null) deque.offer(poll.left);
                    if(poll.right!=null) deque.offer(poll.right);
            }}
            else{
                for(int i =0;i<size;i++){
                    TreeNode poll = deque.pollLast();
                    list.add(poll.val);
                    if(poll.right!=null) deque.offerFirst(poll.right);
                    if(poll.left!=null) deque.offerFirst(poll.left);
            }
            }
            depth++;
            lists.add(list);
        }
        return lists;
    }
}
