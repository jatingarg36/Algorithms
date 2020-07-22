package Dynamic_Programming;

import java.util.Scanner;

public class Subset_Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        int [] set = new int[n];
        for(int i=0;i<n;i++){
            set[i] = input.nextInt();
        }

        int sum = input.nextInt();
        boolean [][] dp = new boolean[n+1][sum+1];

        for(int i=0;i<n+1;i++){
            for(int j=0;j<sum+1;j++){
                dp[i][j]=false;
            }
        }
        for(int i=1;i<n+1;i++){
            for(int j=1;j<sum+1;j++){
                dp[i][j]=dp[i-1][j];
                if(set[i-1]==j){
                    dp[i][j]=true;
                }
                if( j>set[i-1] ){
                    if(dp[i][j-set[i-1]]){
                    dp[i][j]=true;
                }}

            }
        }

        System.out.println(dp[n][sum]);
    }
}
