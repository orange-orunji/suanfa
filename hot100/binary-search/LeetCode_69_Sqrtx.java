// 69. x 的平方根    (EASY)
// https://leetcode.cn/problems/sqrtx/
// 标签: Math / Binary Search / 牛顿迭代法
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_69_Sqrtx {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int r = 0;
        int i = 0,j = x;
        while(i <= j){
            int m = (i+j)>>1;
            if(m == 0&&j==1&&i==0) return 1;
            if(m <= x/m){
                r = m;
                i = m+1;
            }else{
                j = m -1;
            }
        }
        return r;
    }
}
