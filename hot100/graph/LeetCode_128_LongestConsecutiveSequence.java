// 128. 最长连续序列   (MEDIUM)
// https://leetcode.cn/problems/longest-consecutive-sequence/
// 标签: Union Find / Array / Hash Table
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_128_LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int max = 0;
        for(int i : set){
            int count = 1;
            if(!set.contains(i-1)){
                while(set.contains(i+1)){
                    count++;
                    i++;
                }
                max = Math.max(max,count);
            }
        }
        return max;
    }
}
