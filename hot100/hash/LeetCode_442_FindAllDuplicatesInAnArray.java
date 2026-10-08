// 442. 数组中重复的数据   (MEDIUM)
// https://leetcode.cn/problems/find-all-duplicates-in-an-array/
// 标签: Array / Hash Table / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_442_FindAllDuplicatesInAnArray {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new LinkedList<>();
        Set<Integer> set = new HashSet<>(nums.length);
        if(nums.length == 0) return list;
        for(int i = 0 ; i< nums.length ;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
            }else{
                list.add(nums[i]);
            }
        }
        return list;
    }
}
