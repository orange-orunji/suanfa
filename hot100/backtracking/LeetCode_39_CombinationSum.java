// 39. 组合总和   (MEDIUM)
// https://leetcode.cn/problems/combination-sum/
// 标签: Array / Backtracking
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_39_CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0,candidates,target,new LinkedList<Integer>(),result);
        return result;
    }
    void dfs(int start,int[] candidates, int target,LinkedList<Integer> stack,List<List<Integer>> result){
        if(target<0){return;}
        if(target==0){
            result.add(new ArrayList(stack));
            return;
        }
        for(int i =start;i<candidates.length;i++){
            if(candidates[i]>target) return;
            stack.addLast(candidates[i]);
            dfs(i,candidates,target-candidates[i],stack,result);
            stack.removeLast();
        }
    }
}
