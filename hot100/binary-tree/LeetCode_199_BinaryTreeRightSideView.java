// 199. 二叉树的右视图   (MEDIUM)
// https://leetcode.cn/problems/binary-tree-right-side-view/
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
public class LeetCode_199_BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new LinkedList<>();
        if(root == null) return list;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            int count = deque.size();
            for(int i =0;i<count;i++){
                TreeNode poll = deque.poll();
                if(i == count-1) list.add(poll.val);
                if(poll.left!=null) deque.add(poll.left);
                if(poll.right!=null) deque.add(poll.right);
            }
        }
        return list;
    }
}
