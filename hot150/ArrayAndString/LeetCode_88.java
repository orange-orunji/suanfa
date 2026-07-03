package hot150.ArrayAndString;

public class LeetCode_88 {
//  88.合并两个有序数组
//  双指针遍历各个数组
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] newNum = new int[m + n];
        int temp1 = 0, temp2 = 0, index = 0;
        while (temp1 < m && temp2 < n) {
            if (nums1[temp1] <= nums2[temp2]) {
                newNum[index++] = nums1[temp1++];
            } else {
                newNum[index++] = nums2[temp2++];
            }
        }
        if (temp1 == m) {
            while (temp2 < n) {
                newNum[index++] = nums2[temp2++];
            }
        } else {
            while (temp1 < m) {
                newNum[index++] = nums1[temp1++];
            }
        }
        System.arraycopy(newNum,0,nums1,0,newNum.length);
    }
}
