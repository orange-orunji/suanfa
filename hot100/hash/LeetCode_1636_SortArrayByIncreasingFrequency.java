// 1636. 按照频率将数组升序排序   (EASY)
// https://leetcode.cn/problems/sort-array-by-increasing-frequency/
// 标签: Array / Hash Table / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_1636_SortArrayByIncreasingFrequency {
    public int[] frequencySort(int[] nums) {
        int[] counts = new int[201];
        for(int i : nums){
            counts[i+100]++;
        }
        return Arrays.stream(nums).boxed().sorted((a,b)->
                {   int af = counts[a +100],bf = counts[b +100];
                    if (af-bf>0) return 1;
                    else if(af-bf<0) return -1;
                    else return b-a;
                })
                .mapToInt(Integer::intValue).toArray();
    }
}
