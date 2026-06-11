public class LeetCode_283 {
//    283.移动零
public void moveZeroes(int[] nums) {
    int right = 0,left = 0,n = nums.length;
    while(right < n ){
        if(nums[right]!=0){
            if(nums[right]!=nums[left])swag(right,left,nums);
            left++;
        }
        right++;
    }
}

    public void swag(int x, int y, int[] nums) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }
}
