package Sorting;

import java.util.Arrays;

public class Counting_Sort {
    public static void main(String[] args) {
        int[] given_arr = new int[]{10,2,8,1,4,6,5,7,9};
        Counting_Sort counting_sort = new Counting_Sort();
        counting_sort.counting_sort(given_arr);
        counting_sort.printArr(given_arr);
    }

    private void printArr(int[] given_arr) {
        for(int i=0;i<given_arr.length;i++){
            System.out.print(given_arr[i]+" ");
        }
    }

    private void counting_sort(int[] given_arr) {
        int max = find_max(given_arr);
        int[] arr = new int[max+1];
        Arrays.fill(arr,0);
        for (int value : given_arr) {
            arr[value]++;
        }
        int k=0;
        for(int i=0;i<=max;i++){
            int count=arr[i];
            for(int j=0;j<count;j++){
                given_arr[k]=i;
                k++;
            }
        }
    }


    private int find_max(int[] given_arr) {
        int max=-1;
        for(int i=0;i<given_arr.length;i++){
            if(max<given_arr[i]){
                max = given_arr[i];
            }
        }
        return max;
    }
}
