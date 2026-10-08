// 46. 全排列   (MEDIUM)
// https://leetcode.cn/problems/permutations/
// 标签: Array / Backtracking
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_46_Permutations {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] isAdded = new boolean[nums.length]; 
        Arrays.fill(isAdded,false);
        LinkedList<Integer> stack = new LinkedList<>();
        doI(nums,isAdded,stack);
        return  result;
    }
    void doI(int[] nums ,boolean[] isAdded,LinkedList<Integer> stack){
        if(stack.size()==nums.length){
            result.add(new ArrayList<>(stack));
            return;
        }
        for(int i = 0 ; i < nums.length;i++){
            if(isAdded[i]==false){stack.push(nums[i]);
            isAdded[i] = true;
            doI(nums,isAdded,stack);
            isAdded[i] = false;
            stack.poll();}
        }
    }
}
