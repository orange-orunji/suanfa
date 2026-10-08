// 49. 字母异位词分组   (MEDIUM)
// https://leetcode.cn/problems/group-anagrams/
// 标签: Array / Hash Table / String / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_49_GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] chs = str.toCharArray();
            Arrays.sort(chs);
            String target = new String(chs);
            List<String> list = map.get(target);
            if(list==null){
                list = new ArrayList<>();
                map.put(target,list);
            }
            list.add(str);
        } 
        return new ArrayList<>(map.values());
    }
}
