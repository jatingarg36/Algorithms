package Sorting;

public class Merge_Sort {

    void Merge_Sort(int [] givenArr,int low,int high){
        if(low<high){
            int mid = (low+high)/2;

            Merge_Sort(givenArr,low,mid);
            Merge_Sort(givenArr,mid+1,high);

            Merge(givenArr,low,mid,high);
        }

    }

    private void Merge(int[] givenArr, int low,int mid, int high) {
        int i=low;
        int j=mid+1;
        int k=0;
        int [] arr = new int[high+1-low] ;
        while(i<mid+1 && j<high+1){
            if(givenArr[i]>givenArr[j]){
                arr[k]=givenArr[j];
                j++;
            }
            else {
                arr[k]=givenArr[i];
                i++;
            }
            k++;
        }
        while(i<mid+1){
            arr[k]=givenArr[i];
            i++;
            k++;
        }
        while(j<high+1){
            arr[k]=givenArr[j];
            j++;
            k++;
        }

        for(int p = 0;p<high-low+1;p++) {
            givenArr[p+low] = arr[p];
        }
    }

    public static void main(String[] args) {
        int[] given_arr = new int[]{10,2,8,1,4,6,5,7,9};
        Merge_Sort merge_sort = new Merge_Sort();
        merge_sort.Merge_Sort(given_arr,0,given_arr.length-1);
        merge_sort.printArr(given_arr);
    }

    private void printArr(int[] given_arr) {
        for(int i=0;i<given_arr.length;i++){
            System.out.print(given_arr[i]+" ");
        }
    }
}
