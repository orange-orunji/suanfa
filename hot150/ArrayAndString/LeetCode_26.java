//26. 删除有序数组中的重复项
//简单
//相关标签
//premium lock icon
//相关企业
//提示
//给你一个 非严格递增排列 的数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。元素的 相对顺序 应该保持 一致 。然后返回 nums 中唯一元素的个数。
//
//考虑 nums 的唯一元素的数量为 k。去重后，返回唯一元素的数量 k。
//
//nums 的前 k 个元素应包含 排序后 的唯一数字。下标 k - 1 之后的剩余元素可以忽略

class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0, j = 1, n = nums.length;
        while(j < n){
            if(nums[j] > nums[i]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }
        return i+1;
    }
}