// 322. 零钱兑换   (MEDIUM)
// https://leetcode.cn/problems/coin-change/
// 标签: Breadth-First Search / Array / Dynamic Programming / 背包问题 / 完全背包
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_322_CoinChange {
    public int coinChange(int[] coins, int amount) {
        if(amount==0) return 0;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        for(int j = 1;j <amount+1;j++){
            if(coins[0]<=j) dp[j] = dp[j-coins[0]]+1;
            }
            for(int coin : coins){
                for(int j = coin;j<amount+1;j++){
                    if(j>=coin){
                        dp[j] = Math.min(dp[j],dp[j-coin]+1);
                                            }
                }
            }
        return dp[amount] >= amount+1?-1:dp[amount];
    }
}
