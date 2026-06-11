import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LeetCode_15 {
//    15.三数之和
public List<List<Integer>> threeSum(int[] nums) {
    int left, n = nums.length, right = n - 1;
    List<List<Integer>> result = new ArrayList<>();
    Arrays.sort(nums);
    for (int i = 0; i < n; i++) {
        int target = -nums[i];
        if (i > 0 && nums[i - 1] == -target) {
            continue;
        }
        left = i + 1;
        right = n - 1;
        while (left < right) {
            int leftNum = nums[left];
            int rightNum = nums[right];
            if ((leftNum + rightNum) == target) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                right--;
                left++;
                while (left < right && nums[left] == nums[left - 1])
                    left++;
                while (left < right && nums[right] == nums[right + 1])
                    right--;
            } else if ((leftNum + rightNum) > target) {
                right--;
            } else {
                left++;
            }
        }
    }
    return result;
}
}
