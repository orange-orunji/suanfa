// 1365. 有多少小于当前数字的数字   (EASY)
// https://leetcode.cn/problems/how-many-numbers-are-smaller-than-the-current-number/
// 标签: Array / Hash Table / Counting Sort / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_1365_HowManyNumbersAreSmallerThanTheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] result = new int[101];
        Arrays.fill(result,0);
        for(int i = 0;i<n;i++){
            result[nums[i]]++;
        }
        for(int i = 1;i<=100;i++){
            result[i] += result[i-1];
        }
        int[] ret = new int[n];
        for(int i = 0;i<n;i++){
            ret[i] = nums[i] == 0 ?0: result[nums[i]-1];
        }
        return ret;
    }
}
