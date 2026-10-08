// 819. 最常见的单词   (EASY)
// https://leetcode.cn/problems/most-common-word/
// 标签: Array / Hash Table / String / Counting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_819_MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned) {
       HashMap<String,Integer> map = new HashMap<>();
       Set<String> set = Set.of(banned);
       StringBuilder sb = new StringBuilder();
        char[] chars = paragraph.toLowerCase().toCharArray();
       for(char ch : chars){
            if(ch <= 'z'&&ch>='a'){
                sb.append(ch);
            }else if(sb.length()>0){ 
                String key = sb.toString();
                if(!set.contains(key))map.compute(key,(k,v)->v==null?1:v+1);
                sb.setLength(0);
            }
       }
        if(sb.length()>0){
             String key = sb.toString();
             if(!set.contains(key))map.compute(key,(k,v)->v==null?1:v+1);
        }
        int maxLength = 0;
        String max = "";
        for(Map.Entry<String,Integer> e : map.entrySet()){
            if(e.getValue()>maxLength){
                maxLength = e.getValue();
                max = e.getKey();
            }
        }
        return max;
    }
}
