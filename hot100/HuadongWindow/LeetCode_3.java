package hot100.HuadongWindow;

import java.util.HashMap;
import java.util.Map;

public class LeetCode_3 {
//        3.无重复字符的最长字符串
//         滑动窗口来做，实现是用left指针来确定当前字符串的开始地方
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), left = 0, maxLength = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int right = 0; right < n; right++) {
            char ch = s.charAt(right);
            if (map.containsKey(ch))
                left = Math.max(left, map.get(ch) + 1);
            map.put(ch,right);
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

}
