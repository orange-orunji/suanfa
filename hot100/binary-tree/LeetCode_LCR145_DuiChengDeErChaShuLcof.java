// LCR145. 判断对称二叉树   (EASY)
// https://leetcode.cn/problems/dui-cheng-de-er-cha-shu-lcof/
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
public class LeetCode_LCR145_DuiChengDeErChaShuLcof {
    public boolean checkSymmetricTree(TreeNode root) {
        if(root == null||root.left==null&&root.right==null) return  true;
        if(root.left==null||root.right==null) return false;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root.left);
        deque.add(root.right);
        while(!deque.isEmpty()){
            TreeNode x = deque.poll();
            TreeNode y = deque.poll();
            if(x==null&&y==null) continue;
            if(x==null||y==null||x.val!=y.val) return false;
            deque.add(x.left);
            deque.add(y.right);
            deque.add(x.right);
            deque.add(y.left);
        }
        return true;
    }

}
