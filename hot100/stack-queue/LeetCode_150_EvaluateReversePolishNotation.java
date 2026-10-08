// 150. 逆波兰表达式求值   (MEDIUM)
// https://leetcode.cn/problems/evaluate-reverse-polish-notation/
// 标签: Stack / Array / Math
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_150_EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque();
        for(String s : tokens){
            switch(s){
                case "+"->{
                   int b = stack.pop();
                   int a = stack.pop();
                   stack.push(a+b);
                }case "-"->{
                   int b = stack.pop();
                   int a =stack.pop();
                   stack.push(a-b);
                }case "*"->{
                   int b =stack.pop();
                   int a = stack.pop();
                   stack.push(a*b);
                }case "/"->{
                   int b =stack.pop();
                   int a =stack.pop();
                   stack.push(a/b);
                }
                 default->{
                    stack.push(Integer.parseInt(s));
                 }
            }
        }return stack.pop();
    }
}
