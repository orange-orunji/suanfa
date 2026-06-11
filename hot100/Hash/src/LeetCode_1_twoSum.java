import java.util.HashMap;
import java.util.Map;

public class LeetCode_1_twoSum {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> map = new HashMap<>(n);
        for (int i = 0; i < n; i++) {
            int x = nums[i];
            int y = target - x;
            if(map.containsKey(y))
                return new int[]{i,map.get(y)};
            map.put(x,i);
        }
        return null;
    }
}
