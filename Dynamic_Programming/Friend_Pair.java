package Dynamic_Programming;

import java.util.Scanner;

public class Friend_Pair {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for(int i=2;i<n+1;i++){
            a[i] = a[i-1]+(i-1)*a[i-2];
        }
        System.out.println(a[n]);
    }
}
