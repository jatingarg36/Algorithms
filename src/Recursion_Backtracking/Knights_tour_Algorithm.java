package Recursion_Backtracking;

import java.time.Duration;
import java.time.Instant;

/**
 * Here is a recursive Algorithm to print knight moves starting from (0,0) without repeating position on a 8X8 chess board.
 */
public class Knights_tour_Algorithm {
    private static int[][] board = new int[8][8];
    private static int[] knight_move_x = {2, 1, -1, -2, -2, -1, 1, 2};
    private static int[] knight_move_y = {1, 2, 2, 1, -1, -2, -2, -1};

    public static void main(String[] args) {
        for(int i=0;i<8;i++)
            for(int j=0;j<8;j++)
                board[i][j]=-1;
        board[0][0]=0;
        Instant start = Instant.now();
        if(solve(0,0,1))
            printboard();
        Instant end = Instant.now();
        System.out.println("Execution Time: "+ Duration.between(start,end).toMillis()+" milliseconds");
    }

    private static void printboard() {
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++)
                if(board[i][j]/10 == 0)
                    System.out.print(board[i][j] +"  ");
                else
                    System.out.print(board[i][j] +" ");
            System.out.print("\n");}
    }

    private static boolean solve(int x, int y,int count) {
        int i,next_move_x,next_move_y;
        if(count==64){
            return true;
        }
        for (i = 0; i < 8; i++) {
            next_move_x= x+knight_move_x[i];
            next_move_y=y+knight_move_y[i];
            if (isSafe(next_move_x,next_move_y)) {
                board[next_move_x][next_move_y] = count;
                if (solve(next_move_x, next_move_y, count+1))
                    return true;
                else
                    board[next_move_x][next_move_y] = -1;
            }
        }
        return false;
    }
    private static boolean isSafe(int x, int y) {
        if(x>=0 && x<8 && y>=0&&y<8) {
            return board[x][y] == -1;
        }
        return false;
    }

}
