// 518. 零钱兑换 II   (MEDIUM)
// https://leetcode.cn/problems/coin-change-ii/
// 标签: Array / Dynamic Programming / 背包问题 / 完全背包
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_518_CoinChangeIi {
    Integer[][] arr ;
    public int change(int amount, int[] coins) {
   if(amount==0) return 1;
  // if(amount==coins[0]&&coins.length==1) return 1;
        int[] dp = new int[amount+1];
        dp[0] = 1;
        
        for(int coin :coins){
            for(int j =1;j<amount+1;j++){
                if(j>=coin) dp[j] = dp[j-coin]+dp[j];
            }
        }
        return dp[amount];
    }
}
