// 5. 最长回文子串   (MEDIUM)
// https://leetcode.cn/problems/longest-palindromic-substring/
// 标签: Two Pointers / String / Dynamic Programming / Manacher 算法
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_5_LongestPalindromicSubstring {
    public String longestPalindrome(String s) {
        if(s.length()==2&&s.charAt(1)==s.charAt(0)) return s;
        int start = 0,end =0,len;
        for(int i = 0;i<s.length();i++){
            int len1 = find(s,i,i);
            int len2 = find(s,i,i+1);
            len = Math.max(len1,len2);
            if(len> end - start){
                start = i - (len- 1) / 2 ;
                end =i+len/2;
            }
        }
        return  s.substring(start, end + 1);
    }
    int find(String s,int left,int right){
        while((left>=0&&right<s.length())&&(s.charAt(left)==s.charAt(right))){
            left--;
            right++;
        }
        return right - left -1 ;
    }
}
