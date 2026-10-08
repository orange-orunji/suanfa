// 1287. 有序数组中出现次数超过25%的元素   (EASY)
// https://leetcode.cn/problems/element-appearing-more-than-25-in-sorted-array/
// 标签: Array
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_1287_ElementAppearingMoreThan25InSortedArray {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = arr.length/4;
        for(int i : arr){
            map.computeIfAbsent(i,key->0);
            map.put(i,map.get(i)+1);
            if(map.get(i)>count) return i;
        }
        return -1;
    }
}
