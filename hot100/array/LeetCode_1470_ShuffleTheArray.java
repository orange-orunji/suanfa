// 1470. 重新排列数组   (EASY)
// https://leetcode.cn/problems/shuffle-the-array/
// 标签: Array
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_1470_ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int length = nums.length;
        if(length == 1) return nums;
        int[] result = new int[length];
        int fast = length/2;
        int index = 0;
        for(int i = 0;i<length/2;i++){
            result[index++] = nums[i];
            result[index++] = nums[fast]; 
            fast++;
        }
        return result;
    }
    
}
