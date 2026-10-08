// 216. 组合总和 III   (MEDIUM)
// https://leetcode.cn/problems/combination-sum-iii/
// 标签: Array / Backtracking
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_216_CombinationSumIii {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        int minSum = 0;
        for(int i = 0;i<=k;i++){
            minSum+=i;
        }
        boolean b = minSum<=n;
        if(b){dfs(1,0,k,n,new LinkedList<Integer>(),result);}
        return result;
    }
    void dfs(int start,int count,int k,int n,LinkedList<Integer> stack,List<List<Integer>> result){
        if(count == k && n == 0){
            result.add(new ArrayList<>(stack));
        }   
        if(n<0) return;
        for(int i =start;i<10;i++){
            if(i>n) break;
            stack.addLast(i);
            dfs(i+1,count+1,k,n-i,stack,result);
            stack.removeLast();
        }     
    }
}
