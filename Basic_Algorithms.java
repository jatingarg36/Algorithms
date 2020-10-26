import java.util.Scanner;

import static java.lang.Math.pow;

public class Basic_Algorithms {
    public static void main(String... args) {
        Scanner i = new Scanner(System.in);
        int input = i.nextInt();
        System.out.println(fibonacci(input-1));
        System.out.println(isPrime(input));
        System.out.println(isPalindrome(input));
        System.out.println(factorial(input));
        System.out.println(isArmstrong(input));
        int[] array = new int[input];
        for(int j=0;j<input;j++){
            array[j] = i.nextInt();
        }
        int key = i.nextInt();
        System.out.println(linearSearch(array,key));
        System.out.println(binarySearch(array,key));
        selectionSort(array);
        bubbleSort(array);
        insertionSort(array);
    }
    /**
     Basic Algorithms
     **/
    //binary search algorithm for unsorted array(which is actually sorted by bubble sort :p)
    private static String binarySearch(int[] array, int key) {
        int[] sortedArray;
        sortedArray = bubbleSort(array);
        int low=0,high=array.length-1;
        int mid;
        while(low<=high){
            mid = low+high;
            mid= mid%2==0?mid/2:mid/2+1;
            if(sortedArray[mid]==key){
                return "element found at " + (mid+1);
            }
            else{
                if(sortedArray[mid]>key){
                    high =mid-1;
                }else{
                    low=mid+1;
                }
            }
        }
        return "element not found";

    }
    //linear search algorithm
    private static String linearSearch(int[] array, int key) {
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return "element found at " + (i+1);
            }
        }
        return "element not found";
    }
    //insertion sort function
    private static void insertionSort(int[] array) {
        for(int i=1;i<array.length;i++){
            int key = array[i];
            int j=0;
            while(j<i&&array[i-j-1]>key){
                array[i-j]=array[i-j-1];
                j++;
            }
            array[i-j]=key;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
    //selection sort function
    private static void selectionSort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            int index = i;
            for(int j=i+1;j<array.length;j++){
                if(array[j]<array[index]){
                    index = j;
                }
            }
            int tmp = array[i];
            array[i]=array[index];
            array[index]=tmp;
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
    }
    //bubble sort function
    private static int[] bubbleSort(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                }
            }
        }
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+ " ");
        }
        return array;
    }
    //returns about a number being armstrong or not
    private static boolean isArmstrong(long input) {
        if(input==0)
            return true;
        else {
            long sum = 0,n=input;
            while (input!=0){
                sum += pow(input%10,3);
                input/=10;
            }
            if(n==sum){
                return true;
            }
        }
        return false;
    }
    //returns factorial of a number;
    private static long factorial(int n) {
        if(n==1)
            return 1;
        return factorial(n-1)*n;
    }
    //returns palindrome property of a number
    private static boolean isPalindrome(int input) {
        String n = input+"";

        for(int i=0;i<n.length()/2;i++) {
            if (n.charAt(n.length()-i-1) != n.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    //returns true or false wrt weather its a prime or not;
    private static boolean isPrime(int input) {
        if(input<2)
            return false;
        else{
            if(input%2==0){
                return false;
            }
            else {
                for(int i=3;i*i<=input;i+=2){
                    if(input%i==0){
                        return false;
                    }
                }
                return true;
            }
        }

    }
    // returns nth fibonacci number;
    private static long fibonacci(int n) {
        if(n>1)
            return fibonacci(n-1)+fibonacci(n-2);
        if(n==1)
            return 1;
        else
            return 0;
    }
}
