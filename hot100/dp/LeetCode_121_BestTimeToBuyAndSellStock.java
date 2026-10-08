// 121. 买卖股票的最佳时机   (EASY)
// https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/
// 标签: Array / Dynamic Programming
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_121_BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        if(prices.length<2) return 0;
        int min_price = Integer.MAX_VALUE ;
        int maxprofit  = 0;
        for(int i : prices){
             if(min_price > i)
                min_price = i;
             else if( i  - min_price > maxprofit)
                maxprofit = i -  min_price ;
        }
        return maxprofit; 
    }
}
