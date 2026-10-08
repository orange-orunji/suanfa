// 645. 错误的集合   (EASY)
// https://leetcode.cn/problems/set-mismatch/
// 标签: Bit Manipulation / Array / Hash Table / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_645_SetMismatch {
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int[] result = new int[2];
        int prev = 0;
        for(int i = 0;i<n;i++){
            if(nums[i]== prev){
                result[0] = nums[i];
            }
            else if(nums[i]-prev>1){
                result[1] = prev+1;
            }
            prev = nums[i];
        }
        if(prev != n){
            result[1] = n;
        }
        return result;
    }
}
