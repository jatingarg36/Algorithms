package Dynamic_Programming;

import java.util.Scanner;

/**
 * Given a value N, if we want to make change for N cents, and we have
 * infinite supply of each of S = { S1, S2, .. , Sm} valued coins,
 * how many ways can we make the change? The order of coins doesn’t matter.
 */
public class Coin_Change {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int[] s = new int[m];
        for(int i=0;i<m;i++){
            s[i] = input.nextInt();
        }
        int n = input.nextInt();

        int[][] ar = new int[m+1][n+1];

        for(int i=0;i<m+1;i++){
            ar[i][0]=1;
        }
        for(int i =1;i<m+1;i++){
            for(int j=1;j<n+1;j++){
                if(j<s[i-1]){
                    ar[i][j]=ar[i-1][j];
                }
                else{
                    ar[i][j]=ar[i-1][j]+ar[i][j-s[i-1]];
                }
            }
        }
        System.out.println(ar[m][n]);
    }
}
