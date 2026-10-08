// 51. N 皇后   (HARD)
// https://leetcode.cn/problems/n-queens/
// 标签: Array / Backtracking / X 算法
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_51_NQueens {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        LinkedList<String> path = new LinkedList<String>();
        if(n == 1) {
            String s = "Q";
            path.addLast(s);
            result.add(path);
            return result;
            }
        else{dfs(0,n,path,result,new Integer[n]);}
        return result;
    }
    void dfs(int row,int n,LinkedList<String> path,List<List<String>> result,Integer[] cols){
        if( row == n){
            result.add(new ArrayList<>(path));
            return;
        }       
        for(int col = 0;col<n;col++){
            if(!isValid(cols,row,col)){
                continue;
            }
            String s = "";
            for(int j = 0;j<n;j++){
                if(j == col){
                    s += "Q";
                }else{
                    s+=".";
                }
            }
            path.addLast(s);
            cols[row] = col;
            dfs(row+1,n,path,result,cols);
            cols[row] = null;
            path.removeLast();
        }
    }
    boolean isValid(Integer[] cols,int row,int col){
        for(int i = 0;i<row;i++){
            if(cols[i] == null ) continue;
            if(cols[i] == col || Math.abs(cols[i]-col)==Math.abs(row-i)) return false;
        }
        return true;
    }
}
