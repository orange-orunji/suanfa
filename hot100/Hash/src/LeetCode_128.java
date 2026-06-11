import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LeetCode_128 {
//    简易版hash表
//    public int longestConsecutive(int[] nums) {
//        if(nums==null||nums.length==0)return 0;
//        Map<Integer,Integer>  map = new HashMap<>(nums.length);
//        int max = 0;
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length; i++) {
//            if(i==0) {
//                map.put(nums[i], 1);
//                continue;
//            }
//            if(map.containsKey(nums[i])) continue;
//            map.put(nums[i],nums[i]-nums[i-1]>1?1: map.get(nums[i - 1]) + 1);
//            max = Math.max(map.get(nums[i]),max);
//        }
//        return max==0?1:max;
//    }

//    改善做法
    public int longestConsecutive(int[] nums) {
        int max_lenth=0;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        for (int num : set) {
            if(!set.contains(num-1)){
                int currentLength = 1;
                int currentNum = num;
                while(set.contains(currentNum+1)){
                    currentLength++;
                    currentNum++;
                }

                max_lenth = Math.max(currentLength,max_lenth);
            }
        }
        return max_lenth;
    }
}
