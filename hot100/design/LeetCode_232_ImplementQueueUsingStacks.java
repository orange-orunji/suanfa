// 232. 用栈实现队列   (EASY)
// https://leetcode.cn/problems/implement-queue-using-stacks/
// 标签: Stack / Design / Queue
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_232_ImplementQueueUsingStacks {
    Deque<Integer> inStack;
    Deque<Integer> outStack;
    public LeetCode_232_ImplementQueueUsingStacks() {
        inStack = new ArrayDeque<>();
        outStack = new ArrayDeque<>();
    }
    
    public void push(int x) {
        inStack.push(x);
    }
    
    public int pop() {
        if(!empty()){
          if(outStack.isEmpty())  while(!inStack.isEmpty()){outStack.push(inStack.pop());}
        }
        return outStack.pop();
    }
    
    public int peek() {
        if(!empty()){
           if(outStack.isEmpty())  while(!inStack.isEmpty()){outStack.push(inStack.pop());}
        }
        return outStack.peek();
    }
    
    public boolean empty() {
        return inStack.isEmpty()&&outStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
