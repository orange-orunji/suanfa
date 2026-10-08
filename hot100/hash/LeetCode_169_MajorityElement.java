// 169. 多数元素   (EASY)
// https://leetcode.cn/problems/majority-element/
// 标签: Array / Hash Table / Divide and Conquer / Counting / Sorting / 摩尔投票算法
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_169_MajorityElement {
    public int majorityElement(int[] nums) {
        int length = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            if(!map.containsKey(i)){
                map.put(i,1);
            }else{
                int count = map.get(i) + 1;
                if(count>length/2) return i;
                map.put(i,count);
            }
        }
        return nums[0];
    }
}
