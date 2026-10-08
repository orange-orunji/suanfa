// 20. 有效的括号   (EASY)
// https://leetcode.cn/problems/valid-parentheses/
// 标签: Stack / String / 括号序列
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_20_ValidParentheses {
    public boolean isValid(String s) {
        int n = s.length();
        if(n%2==1) return false;
        Deque<Character> deque = new LinkedList<>();
        for(int i =0;i<n;i++){
            char ch = s.charAt(i);
            if(ch =='(') 
                deque.push(')');
            else if(ch =='[')
                deque.push(']');
            else if(ch == '{')
                deque.push('}');
            else if(deque.isEmpty()||deque.pop()!=ch)
                return false;
        }
        return deque.isEmpty();
    }
}
