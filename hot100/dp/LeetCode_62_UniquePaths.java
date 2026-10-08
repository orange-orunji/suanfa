// 62. 不同路径   (MEDIUM)
// https://leetcode.cn/problems/unique-paths/
// 标签: Math / Dynamic Programming / Combinatorics
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_62_UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        for(int i = 0;i<m+1;i++) dp[i][0] = 1;
        for(int j = 1;j<n+1;j++) dp[0][j] =1;
        for(int i = 1;i<m;i++){
            for(int j =1;j<n;j++){
                dp[i][j] = dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
}
