package hot150.ArrayAndString;

public class LeetCode_27 {

//    27.移除元素
    public int removeElement(int[] nums, int val) {
        int left = 0, right = 0, n = nums.length;
        for(;right<n;right++){
            if(nums[right]!=val){
                nums[left] = nums[right];
                left++;
            }
        }
        return left;
    }

}
