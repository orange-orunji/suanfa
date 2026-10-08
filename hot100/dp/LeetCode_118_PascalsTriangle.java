// 118. 杨辉三角   (EASY)
// https://leetcode.cn/problems/pascals-triangle/
// 标签: Array / Dynamic Programming
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_118_PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
    List<List<Integer>> result = new ArrayList<>();
    List<Integer> list;
    for(int i = 0; i < numRows ; i++){
        list = new ArrayList<>(i+1);
        for(int j = 0; j <= i ; j ++){
            if(j == 0 || j == i  ) {
               list.add(1);
            }
            else{
                List<Integer> prelist = result.get(i- 1);
                int sum = prelist.get(j) + prelist.get(j-1);
                list.add(sum);
            }
        }
        result.add(list);
    }
    return result;
    }
}
