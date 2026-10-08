// 395. 至少有 K 个重复字符的最长子串   (MEDIUM)
// https://leetcode.cn/problems/longest-substring-with-at-least-k-repeating-characters/
// 标签: Hash Table / String / Divide and Conquer / Sliding Window
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_395_LongestSubstringWithAtLeastKRepeatingCharacters {
    public int longestSubstring(String s, int k) {
        if(s.length() == 0 ||s.length()<k) return 0;
        int[] arr = new int[26];
        for(int i = 0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        int maxLen = 0 ;
        for(int i = 0 ;i<26;i++){
            if(arr[i]>0&&arr[i]<k){
                char c = (char)( i+'a');
                String[] strs = s.split(String.valueOf(c));
                for(String s1 : strs){
                    maxLen = Math.max(maxLen,longestSubstring(s1,k));
                }
                    return maxLen;

        }
    }return s.length();
}
}
