package Sorting;

public class Quick_Sort {

    void Quick_Sort(int[] givenArr,int low,int high){
        if(low<high){
            int pi = partition(givenArr,low,high);
            Quick_Sort(givenArr,low,pi-1);
            Quick_Sort(givenArr,pi+1,high);
        }

    }

    private int partition(int[] givenArr, int low, int high) {
        int pivot = givenArr[high];
        int i=low-1;
        for(int j=low;j<=high-1;j++){
            if(pivot>givenArr[j]){
                i++;
                swap(givenArr,i,j);
            }
        }
        swap(givenArr,i+1,high);

        return i+1;
    }

    void swap(int[] arr, int a,int b){
        int tmp = arr[a];
        arr[a]=arr[b];
        arr[b]=tmp;
    }
    public static void main(String[] args) {
        int[] given_arr = new int[]{10,2,8,1,4,6,5,7,9};
        Quick_Sort quick_sort = new Quick_Sort();
        quick_sort.Quick_Sort(given_arr,0,given_arr.length-1);
        quick_sort.printArr(given_arr);
    }

    private void printArr(int[] given_arr) {
        for(int i=0;i<given_arr.length;i++){
            System.out.print(given_arr[i]+" ");
        }
    }
}
