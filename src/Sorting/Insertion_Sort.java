package Sorting;

public class Insertion_Sort {
    void Insertion_Sort(int[] givenArr){
        for(int i=1;i<givenArr.length;i++){
            int tmp = givenArr[i];
            for(int j=i-1;j>=0;j--){
                if(tmp<givenArr[j]){
                    swap(givenArr,j+1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    void swap(int[] arr,int a,int b){
        int tmp = arr[b];
        arr[b] = arr[a];
        arr[a] = tmp;
    }
    public static void main(String[] args) {
        int[] given_arr = new int[]{10,2,8,1,4,6,5,7,9};
        Insertion_Sort insertion_sort = new Insertion_Sort();
        insertion_sort.Insertion_Sort(given_arr);
        insertion_sort.printArr(given_arr);
    }
    private void printArr(int[] given_arr) {
        for(int i=0;i<given_arr.length;i++){
            System.out.print(given_arr[i]+" ");
        }
    }
}
