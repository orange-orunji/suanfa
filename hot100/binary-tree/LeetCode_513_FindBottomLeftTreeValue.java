// 513. 找树左下角的值   (MEDIUM)
// https://leetcode.cn/problems/find-bottom-left-tree-value/
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
public class LeetCode_513_FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        if(root.left ==null && root.right == null) return root.val;
        Deque<TreeNode> deque = new LinkedList<>();
        int left = root.val;
        deque.add(root);
        while(!deque.isEmpty()){
            int count =  deque.size();
            left = deque.peek().val;
            for(int i = 0;i<count;i++){
                TreeNode poll = deque.poll();
                if(poll.left!=null) deque.add(poll.left);
                if(poll.right!=null) deque.add(poll.right);
            }
        }
        return left;
    }
}
