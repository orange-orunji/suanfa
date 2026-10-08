// 217. 存在重复元素   (EASY)
// https://leetcode.cn/problems/contains-duplicate/
// 标签: Array / Hash Table / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_217_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Object value ;
        HashMap<Integer,Object> map = new HashMap<>();
        for(int i : nums){
            value = map.put(i,i);
           if(value!=null) return true;
        }return false;
    }
}
