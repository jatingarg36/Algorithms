package Dynamic_Programming;


import java.util.Scanner;


/**
 * Given a gold mine of n*m dimensions. Each field in this mine contains a positive
 * integer which is the amount of gold in tons. Initially the miner is at first
 * column but can be at any row. The miner can only move to the cell diagonally up
 * towards the right or right or diagonally down towards the right.
 * Find out maximum amount of gold he can collect.
 *
 * test_case:
 * 4 4
 * 10 33 13 15
 * 22 21 04 1
 * 5 0 2 3
 * 0 6 14 2
 *
 * output : 83
 */
public class Gold_Mine_Source_Flipkart {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,m;
        n = input.nextInt();
        m = input.nextInt();
        int[][] mine = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mine[i][j] = input.nextInt();
            }
        }
        System.out.println(get_max_gold(mine,n,m));
    }

    private static int get_max_gold(int[][] mine,int n,int m) {
        int max=0;

        for(int j=1;j<m;j++){
            for(int i=0;i<n;i++){
                if(i==0){
                    mine[i][j]+=Math.max(mine[i+1][j-1],mine[i][j-1]);
                }
                else if(i==n-1){
                    mine[i][j]+=Math.max(mine[i-1][j-1],mine[i][j-1]);
                }
                else{
                    mine[i][j]+=Math.max(mine[i-1][j-1],Math.max(mine[i+1][j-1],mine[i][j-1]));
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(mine[i][j]+" ");
            }
            System.out.println("");
        }
        for(int i=0;i<n;i++){
            if(max<mine[i][m-1]){
                max = mine[i][m-1];
            }
        }
        return max;
    }

}
