package Recursion_Backtracking;

/**
 * here is an algorithm to print all the arrangement of N queens in NXN matrix.
 */

import java.util.Scanner;

public class N_Queen_Extended_Algorithm {
    private static int[][] board;
    private static int numOfSolutions=0;
    public static void main(String[] args) {
        System.out.print("Enter value of N: ");
        Scanner input = new Scanner(System.in);
        int n;
        try {
            n = input.nextInt();
            if(n<4)
                System.out.println("Not possible for the given value of n");
            else{board = new int[n][n];
            setQueen(0);
                System.out.println("Their are in total "+numOfSolutions+" solution for " + n+"X"+ n+" Matrix"); }
            System.out.println("Want to try another no. y/n: ");
            String check = input.next();
            if (check.equals("y") || check.equals("Y")) {
                numOfSolutions=0;
                main(null);
            } else {
                System.out.println("Thank You :) ");
                System.exit(0);
            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());}

    }
    private static void setQueen(int n) {
        if(n==board.length){
            printBoard(board.length);
        }
        else {
                for(int j=0;j<board.length;j++) {
                    if (isAttacked(n, j, board.length)) {
                        continue;
                    }
                    board[n][j] = 1;  // set the board at this position
                    setQueen(n + 1);  // backtrack starts here
                    board[n][j] = 0;  // unset the board which implies the one backward step;
                }
        }
    }

    private static boolean isAttacked(int a, int b,int n) {
        for(int i=0;i<n;i++){
            if(board[a][i]==1)
                return true;
        }
        for(int i=0;i<n;i++){
            if(board[i][b]==1)
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
        numOfSolutions++;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(board[i][j]+" ");
            }
            System.out.print("\n");
        }
        for(int i=0;i<n;i++)
            System.out.print("==");
        System.out.print("\b\n");
    }
}
