// 583. 两个字符串的删除操作   (MEDIUM)
// https://leetcode.cn/problems/delete-operation-for-two-strings/
// 标签: String / Dynamic Programming / 最长公共子序列
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_583_DeleteOperationForTwoStrings {
    public int minDistance(String word1, String word2) {
        int m = word1.length(),n = word2.length();
        int[][] dp = new int[m+1][n+1];
        char[] chs1 = word1.toCharArray();
        char[] chs2 = word2.toCharArray();
        for(int i =1;i<m+1;i++){
            char ch1 = chs1[i-1];
            for(int j =1 ;j<n+1;j++){
                char ch2 = chs2[j-1];
                if(ch1 == ch2) {
                    dp[i][j] = dp[i-1][j-1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        return m + n - 2 * dp[m][n];
    }
}
