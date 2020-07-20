package Recursion_Backtracking;

import java.util.Scanner;

public class Subset_Sum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int n=input.nextInt();
        int [] set = new int[n];
        for(int i=0;i<n;i++){
            set[i] = input.nextInt();
        }

        int sum = input.nextInt();
        System.out.println(is_subset(set,n,sum));
    }

    private static boolean is_subset(int[] set, int n,int sum) {

        if(sum<0)
            return false;
        if(sum==0)
            return true;
        if(n>0){
            return is_subset(set,n-1,sum-set[n-1]) | is_subset(set,n-1,sum);
        }
        return false;
    }
}
