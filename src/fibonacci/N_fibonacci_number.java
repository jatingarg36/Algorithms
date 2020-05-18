package fibonacci;

import java.util.Scanner;

public class N_fibonacci_number {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter N to get its Fibonacci Number: ");
        int n = input.nextInt();
        long curr =1,prev =0,tmp;
        for(int i=2;i<n+1;i++){
            tmp = curr+prev;
            prev = curr;
            curr =tmp;
        }
        System.out.println(curr);
    }
}
