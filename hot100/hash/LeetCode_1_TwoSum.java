// 1. 两数之和   (EASY)
// https://leetcode.cn/problems/two-sum/
// 标签: Array / Hash Table
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i = 0;i<n;i++){
            int x = nums[i];
            int y = target - x;
            if(map.containsKey(y)){
                return new int[]{map.get(y),i};
            }
            map.put(x,i);
        }
        return null;
    }
}
