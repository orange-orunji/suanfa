// 3. 无重复字符的最长子串   (MEDIUM)
// https://leetcode.cn/problems/longest-substring-without-repeating-characters/
// 标签: Hash Table / String / Sliding Window
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_3_LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n<=1){
            return n;
        }
        HashMap<Character,Integer> map = new HashMap<>();
        int max = 0,left = 0;
        for(int i = 0;i<n;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                left = Math.max(left,map.get(ch)+1);
            }
            map.put(ch,i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
}
