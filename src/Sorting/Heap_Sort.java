package Sorting;

import Tree.Heap;

public class Heap_Sort{
    int[] heap_sort(int[] given_arr){
        int[] sorted_arr = new int[given_arr.length];

        Heap heap = new Heap(); // Heap is another class.(can be found in tree folder)
        heap.build_max_heap(given_arr);
        for(int i=given_arr.length-1;i>=0;i--){
            sorted_arr[i]=given_arr[0];
            heap.pop(given_arr);
        }
        return sorted_arr;
    }
    public static void main(String[] args) {
        int[] given_arr = new int[]{10,2,4,13,6,1,8,15};

        int[] sorted_arr = new Heap_Sort().heap_sort(given_arr);
        for(int i:sorted_arr){
            System.out.println(i);
        }
    }
}
