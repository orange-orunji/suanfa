// 15. 三数之和   (MEDIUM)
// https://leetcode.cn/problems/3sum/
// 标签: Array / Two Pointers / Sorting
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_15_3sum {
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
