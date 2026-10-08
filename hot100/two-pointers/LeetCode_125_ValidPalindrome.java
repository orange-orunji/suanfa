// 125. 验证回文串   (EASY)
// https://leetcode.cn/problems/valid-palindrome/
// 标签: Two Pointers / String
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        if(s.length()<=1) return true;
        int left = 0,right = s.length() -1;
        while(left<right){
            while(left<right&& !Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(right>left && !Character.isLetterOrDigit(s.charAt(right)))
                right--;
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
