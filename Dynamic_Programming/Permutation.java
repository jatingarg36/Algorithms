package Dynamic_Programming;

import java.util.Scanner;

/**
 * An efficient dynamic programming algorithm to find permutation coefficient C(n,k).
 * time : O(k)
 * space : O(1)
 */
public class Permutation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        long p=1;
        for(int i=0;i<k;i++){
            p*=(n-i);
        }
        System.out.println(p);
    }
}
