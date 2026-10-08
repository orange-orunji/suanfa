// 40. 组合总和 II   (MEDIUM)
// https://leetcode.cn/problems/combination-sum-ii/
// 标签: Array / Backtracking
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_40_CombinationSumIi {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        dfs(0,candidates,target,new LinkedList<Integer>(),result);
        return result;
    }
    void dfs(int start,int[] candidates, int target,LinkedList<Integer> stack,List<List<Integer>> result){
        if(target == 0 ){
            result.add(new ArrayList(stack));
            return;
        }
        for(int i = start;i<candidates.length;i++){
            if(candidates[i]>target) break;
            if(i>start&&candidates[i] == candidates[i-1]){
                continue;
            }
            stack.addLast(candidates[i]);
            dfs(i+1,candidates,target-candidates[i],stack,result);
            stack.removeLast();
        }
    }
}
