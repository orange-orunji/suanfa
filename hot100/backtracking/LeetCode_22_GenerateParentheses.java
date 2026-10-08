// 22. 括号生成   (MEDIUM)
// https://leetcode.cn/problems/generate-parentheses/
// 标签: String / Dynamic Programming / Backtracking / 括号序列
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_22_GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        ArrayList<String>[] dp = new ArrayList[n+1];
        dp[0] = new ArrayList<>(List.of(""));
        dp[1] = new ArrayList<>(List.of("()"));
        for(int i = 2;i<n+1;i++){
            dp[i] = new ArrayList<>();
            for(int j = 0 ; j < i ; j++){
                for(String str1 : dp[j]){
                    for(String str2 : dp[i - 1 - j]){
                        dp[i].add("("+str1+")"+str2);
                    }
                }
            }
        }
        return dp[n];
    }
}
