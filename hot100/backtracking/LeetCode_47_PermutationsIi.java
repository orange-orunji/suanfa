// 47. 全排列 II   (MEDIUM)
// https://leetcode.cn/problems/permutations-ii/
// 标签: Array / Backtracking / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_47_PermutationsIi {
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        Arrays.sort(nums);
        Arrays.fill(visited,false);
        LinkedList<Integer> stack = new LinkedList<>();
        doI(nums,visited,stack);
        return list;
    }
    void doI(int[] nums,boolean[] visited,LinkedList<Integer> stack){
        if(stack.size() == nums.length) {
            list.add(new ArrayList(stack));
            return;
        }
        for(int i =0;i<nums.length;i++){
            if(visited[i]) continue;
            if(i>0&&nums[i] == nums[i-1]&&!visited[i-1]) continue;
            stack.push(nums[i]);
            visited[i] = true;
            doI(nums,visited,stack);
            visited[i] = false;
            stack.poll();
        }
    }
}
