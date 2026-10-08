// 136. 只出现一次的数字   (EASY)
// https://leetcode.cn/problems/single-number/
// 标签: Bit Manipulation / Array
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_136_SingleNumber {
    public int singleNumber(int[] nums) {
        int result = nums[0];
        for(int i =1;i<nums.length;i++){
            result ^= nums[i];
        }
        return result;
    }

}
