// 242. 有效的字母异位词   (EASY)
// https://leetcode.cn/problems/valid-anagram/
// 标签: Hash Table / String / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i = 0;i < s.length();i++){
            char ch = s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,0);
            }
                map.put(ch,map.get(ch)+1);
        }
        for(int i = 0 ;i<t.length();i++){
            char ch = t.charAt(i);
            if(!map.containsKey(ch)) return false;
            else{
                map.put(ch,map.get(ch)-1);
                if(map.get(ch)==0){
                    map.remove(ch);
                }
            }
        }
        return true;
    }
}
