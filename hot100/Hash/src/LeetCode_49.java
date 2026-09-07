import java.util.*;

public class LeetCode_49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> map = new HashMap<>();
        for(String str : strs){
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String s = new String(ch);
            ArrayList<String> list = map.computeIfAbsent(s, k -> new ArrayList<>());
            list.add(str);
        }
        return new ArrayList<>(map.values());
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();
        int n = strs.length;
        for(int i = 0 ;i < n; i++){
            String str = strs[i];
            char[] ls = str.toCharArray();
            Arrays.sort(ls);
            String nstr = new String(ls);
            List<String> list = map.get(nstr);
            if(list == null){
                list = new ArrayList<>();
                map.put(nstr,list);
            }
            list.add(str);
        }
        return new ArrayList<>(map.values());
    }
}
