public class LeetCode_11 {
//    11.盛最多水的容器
    public int maxArea(int[] height) {
        int maxHeight = 0, left = 0, right = height.length - 1;
        while (left != right) {
            int x = height[left];
            int y = height[right];
            maxHeight = Math.max((right - left) * Math.min(x,y), maxHeight);
            if(x <= y){
                left++;
            }
            else{
                right--;
            }
        }
        return maxHeight;
    }
}
