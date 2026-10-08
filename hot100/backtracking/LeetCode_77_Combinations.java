// 77. 组合   (MEDIUM)
// https://leetcode.cn/problems/combinations/
// 标签: Backtracking
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_77_Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(1,n,k,new LinkedList<Integer>(),result);
        return result;
    }
    void dfs(int start,int n,int k,LinkedList<Integer> stack,List<List<Integer>> result){
        if(k == stack.size()){
            result.add(new ArrayList(stack));
        }
        for(int i = start;i<n+1;i++){
            if(k - stack.size() > n - i +1){
                continue;
            }
            stack.addLast(i);
            dfs(i+1,n,k,stack,result);
            stack.removeLast();
        }
    }
}
