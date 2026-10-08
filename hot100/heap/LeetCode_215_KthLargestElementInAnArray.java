// 215. 数组中的第K个最大元素   (MEDIUM)
// https://leetcode.cn/problems/kth-largest-element-in-an-array/
// 标签: Array / Divide and Conquer / Quickselect / Sorting / Heap (Priority Queue)
// 复杂度: 时间 O(?) 空间 O(?)      <- 补上
// 思路:                            <- 补一句
import java.util.*;
import java.util.stream.*;
import java.math.*;

public class LeetCode_215_KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        MaxHeap heap = new MaxHeap(nums);
        while(heap.size>0){
           heap.swap(0,heap.size-1);
           heap.size--;
           heap.down(0);
          
        }
        
        return heap.arr[heap.arr.length-k];
       
    }}

class MaxHeap {
    public int[] arr ;
    public int size;

    public MaxHeap(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
        heapify();
    }
    public void heapify(){
        for (int i = (size / 2 - 1); i >= 0 ; i--) {
            down(i);
        }
    }
    public void down(int parent){
        int left = parent*2 +1;
        int right = left +1;
        int max = parent;
        if(left<size && arr[left]> arr[max]){
            max = left;
        }
        if(right < size && arr[right]> arr[max]){
            max = right;
        }
        if(max != parent){
            swap(max,parent);
            down(max);
        }
    }
    public void swap(int i , int j){
        int temp = arr[i];
        arr[i] =arr[j];
        arr[j] =temp;
    }
    public void up(int child){
        while(child > 0 ){
            int parent = (child -1) /2;
            if(arr[parent]<arr[child]){
                swap(parent,child);
                child = parent;
            }else break;
        }
    }
    public boolean offered(int value){
        if(isFull()) return false;
        arr[size] = value;
        size++;
        up(size-1);
        return true;
    }
    public int pop(){
        if(isEmpty()) return -1;
        int value = arr[0];
        swap(0,size-1);
        size--;
        down(0);
        return value;
    }
    public int peek(){
        if(isEmpty()) return -1;
        return arr[0];
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public boolean isFull(){
        return size == arr.length;
    }
}
