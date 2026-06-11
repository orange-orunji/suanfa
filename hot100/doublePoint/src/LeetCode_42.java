public class LeetCode_42 {
//     42.接雨水
//    解法1:动态dp
    public int trap(int[] height) {
        int n = height.length;
        if(n==0) return 0;

        int[] leftMax = new int[n];
        leftMax[0] = height[0];
        for(int i = 1;i<n;i++){
            leftMax[i] = Math.max(leftMax[i-1],height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i = n - 2;i>=0;i--){
            rightMax[i] = Math.max(rightMax[i+1],height[i]);
        }

        int result = 0;
        for(int i = 0;i<n;i++){
            result += Math.min(leftMax[i],rightMax[i])-height[i];
        }
        return result;
    }
//    解法2:双指针
}
