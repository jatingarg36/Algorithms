package Tree;

public class Heap {

    public void build_max_heap(int[] heap){
        for(int i=heap.length/2;i>=0;i--){
            max_Heapify(heap,i,heap.length);
        }
    }
    private void build_min_heap(int[] heap){
        for(int i=heap.length/2;i>=0;i--){
            min_heapify(heap,i,heap.length);
        }
    }
    private void max_Heapify(int[] heap, int i, int N){
        int largest;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<N && heap[left]>heap[i]){
            largest = left;
        }
        else{
            largest = i;
        }
        if(right<N && heap[right]>heap[largest]){
            largest = right;
        }

        if(largest != i){
            swap(heap, i,largest);
            max_Heapify(heap,largest,N);
        }
    }

    private void swap(int[] heap, int a, int b) {
        int tmp = heap[a];
        heap[a] = heap[b];
        heap[b] = tmp;
    }

    private void min_heapify(int[] heap, int i, int N){
        int smallest;
        int left = 2*i+1;
        int right = 2*i+2;
        if(left<N && heap[left]<heap[i]){
            smallest = left;
        }
        else{
            smallest = i;
        }
        if(right<N && heap[right]<heap[smallest]){
            smallest = right;
        }

        if(smallest != i){
            swap(heap, i,smallest);
            min_heapify(heap,smallest,N);
        }
    }
    public static void main(String[] args) {
        int[] heap = new int[]{1,4,3,7,8,9,10};
        new Heap().build_max_heap(heap);

        for (int value : heap) {
            System.out.println(value);
        }
        System.out.println();
        new Heap().build_min_heap(heap);
        for (int value : heap) {
            System.out.println(value);
        }

    }

    public void pop(int[] arr) {
        arr[0]=-1;
        build_max_heap(arr);
    }
}
