// 164. 最大间距   (MEDIUM)
// https://leetcode.cn/problems/maximum-gap/
// 标签: Array / Bucket Sort / Radix Sort / Sorting / 抽屉原理
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_164_MaximumGap {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        return bucketSort(nums);
    }
        public static int bucketSort(int[] nums){
            int max = nums[0];
            int min = nums[0];
            for(int i:nums){
                if(i<min) min = i;  
                if(i>max) max = i;
            }
            int range = Math.max(1,(max-min)/(nums.length));
             Pair[] buckets = new Pair[(max-min)/range+1];
            for(int i : nums){
                if( buckets[(i-min)/range] == null)  buckets[(i-min)/range] = new Pair();
                buckets[(i-min)/range].add(i);
            }
            int maxLength =0;
            Pair lastMax = null ;
            for(int i =0;i<(max-min)/range+1;i++){
                if(buckets[i]!=null){
                    if(lastMax!=null) maxLength = Math.max(maxLength,buckets[i].min-lastMax.max);              
                       lastMax = buckets[i]; 

                }                   
            }
            return maxLength;
        }
        static class Pair{
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            void add(Integer i){
                if(i<min) min = i;
                if(i>max ) max = i;
            }
        }
























    //     public static int bucketSort(int[] nums){
    //     if(nums == null ||nums.length<=1) return 0;
    //     int max = nums[0],min = nums[0];
    //     for (int i : nums) {
    //         if(i<min) min = i;
    //         if(max < i) max = i;
    //     }
    //     int range = Math.max((max-min)/(nums.length-1),1);
    //     Pair[] buckets = new Pair[(max -min)/range+1];
    //     // 将原数组中的每个数分组到桶中
    //     for (int i : nums) {
    //         if(buckets[(i-min)/range]==null) buckets[(i-min)/range] = new Pair();
    //         buckets[(i-min)/range].add(i);
    //     }
    //     int r = 0;
    //     Pair lastMax = null;
    //     for(Pair bucket : buckets){
    //         if(bucket!=null){
    //             if (lastMax != null) {
    //             r = Math.max(bucket.min-lastMax.max,r);
    //             }
    //             lastMax = bucket;
    //         }
    //     }
    //     return r;
//}
    // static class Pair{
    //         int max = Integer.MIN_VALUE;
    //         int min = Integer.MAX_VALUE;
    //     public Pair() {
    //     }
    //     void add(int i){
    //         max = Math.max(max,i);
    //         min = Math.min(min,i);
    //     }
        
    // }
}
