// 435. 无重叠区间   (MEDIUM)
// https://leetcode.cn/problems/non-overlapping-intervals/
// 标签: Greedy / Array / Dynamic Programming / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_435_NonOverlappingIntervals {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count = 0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int[] prev = intervals[0];
        for(int i = 1;i<intervals.length;i++){
            if(intervals[i][0]>=prev[1]){
                 prev = intervals[i];
            }else{
               count++;
            }

        }
        return count;
    }
    
}
