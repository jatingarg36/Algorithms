package Recursion_Backtracking;

/**
 * here is an algorithm to print the first possible arrangement of N queens in NXN matrix.
 */

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class N_Queen_Algorithm {
    private static int[][] board;
    public static void main(String[] args) {
        System.out.print("Enter value of N: ");
        Scanner input = new Scanner(System.in);
        int n;
        try {
            n = input.nextInt();
            Instant start = Instant.now();
            if(n<4)
                System.out.println("Not possible for the given value of n");
            else{
                board = new int[n][n];
                if(setQueen(0))
                   printBoard(board.length);
            }
            Instant end = Instant.now();
            System.out.println("Execution Time: "+ Duration.between(start,end).toMillis());
            System.out.println("Want to try another no. y/n: ");
            String check = input.next();
            if (check.equals("y") || check.equals("Y")) {
                main(null);
            } else {
                System.out.println("Thank You :) ");
                System.exit(0);
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());}

    }
    private static boolean setQueen(int n) {
        if(n==board.length){
            return true;
        }
        else {
            for(int j=0;j<board.length;j++) {
                if (isAttacked(n, j, board.length)) {
                    continue;
                }
                board[n][j] = 1;  // set the board at this position
                if(setQueen(n + 1))
                    return true;  // backtrack starts here
                board[n][j] = 0;  // unset the board which implies the one backward step;
            }
        }
        return false;
    }

    private static boolean isAttacked(int a, int b,int n) {
        for(int i=0;i<n;i++){
            if(board[i][b]==1 || board[a][i]==1)
                return true;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(((i+j)==(a+b)) || (i-j)==(a-b)){
                    if(board[i][j]==1)
                        return true;
                }
            }
        }
        return false;
    }

    private static void printBoard(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\b\n");
    }
}
