// 485. 最大连续 1 的个数   (EASY)
// https://leetcode.cn/problems/max-consecutive-ones/
// 标签: Array
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_485_MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxLength = 0;
        int x = 1,count = 0;
        for(int i : nums){
            if((x & i )==0){ 
                x = 1;
                count = 0;
            }
            else{
                count++;
            }
            maxLength = Math.max(maxLength,count);
        }
        return maxLength;
    }
}
