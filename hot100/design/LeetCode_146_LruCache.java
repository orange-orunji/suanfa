// 146. LRU 缓存   (MEDIUM)
// https://leetcode.cn/problems/lru-cache/
// 标签: Design / Hash Table / Linked List / Doubly-Linked List
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_146_LruCache extends LinkedHashMap<Integer,Integer>{
    private int capacity ;
    public LeetCode_146_LruCache(int capacity) {
        super(capacity,0.75F,true);
        this.capacity = capacity;
    }
    
    public int get(int key) {
       return  super.getOrDefault(key,-1);
    }
    
    public void put(int key, int value) {
        super.put(key,value);
    }
    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity; 
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
