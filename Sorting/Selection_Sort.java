package Sorting;

public class Selection_Sort {

    void Selection_Sort(int[] givenArr){

        int min;
        int index_min;
        int[] tmp;
        for(int i=0;i<givenArr.length;i++){
            tmp = find_min(givenArr,i);
            index_min = tmp[1];
            min = tmp[0];
            for(int j=index_min;j>i;j--){
                givenArr[j]=givenArr[j-1];
            }
            givenArr[i]=min;
        }

    }

    private int[] find_min(int[] givenArr,int start) {
        int min = givenArr[start];
        int index_min = start;
        for(int i=start+1;i<givenArr.length;i++){
            if(min>givenArr[i]){
                min = givenArr[i];
                index_min = i;
            }
        }
        return new int[]{min, index_min};
    }

    public static void main(String[] args) {
        int[] given_arr = new int[]{10,2,8,1,4,6,5,7,9};
        Selection_Sort selection_sort = new Selection_Sort();
        selection_sort.Selection_Sort(given_arr);
        selection_sort.printArr(given_arr);
    }
    private void printArr(int[] given_arr) {
        for(int i=0;i<given_arr.length;i++){
            System.out.print(given_arr[i]+" ");
        }
    }
}
