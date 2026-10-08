// 387. 字符串中的第一个唯一字符   (EASY)
// https://leetcode.cn/problems/first-unique-character-in-a-string/
// 标签: Queue / Hash Table / String / Counting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_387_FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        int[] arr = new int[26];
        char[] ch = s.toCharArray();
        for(char c : ch){
            arr[(int)(c-97)]++;
        }
        for(int i =0;i<s.length();i++){
            if(arr[s.charAt(i)-97]==1) return i;
        }
        return -1;
    }
}
