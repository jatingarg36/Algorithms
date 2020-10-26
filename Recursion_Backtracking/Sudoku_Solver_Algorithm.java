package Recursion_Backtracking;

public class Sudoku_Solver_Algorithm {
    private static int N;
    public static void main(String[] args) {
        int[][] board = { {3, 0, 6, 5, 0, 8, 4, 0, 0},
                          {5, 2, 0, 0, 0, 0, 0, 0, 0},
                          {0, 8, 7, 0, 0, 0, 0, 3, 1},
                          {0, 0, 3, 0, 1, 0, 0, 8, 0},
                          {9, 0, 0, 8, 6, 3, 0, 0, 5},
                          {0, 5, 0, 0, 9, 0, 6, 0, 0},
                          {1, 3, 0, 0, 0, 0, 2, 5, 0},
                          {0, 0, 0, 0, 0, 0, 0, 7, 4},
                          {0, 0, 5, 2, 0, 6, 3, 0, 0} };
        N = board.length;
        if(!solve(board)){
            System.out.println("NO, Solution");
        }
        else
            printSolution(board);
    }

    private static void printSolution(int[][] board) {
        for (int i = 0; i <N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(board[i][j] + " ");
            System.out.print("\n");
        }
    }

    private static boolean solve(int[][] board) {
        int row = -1;
        int col = -1;
        boolean found =false;

        for(int i=0;i<N;i++){
            for(int j = 0; j<N; j++){
                if(board[i][j]==0){
                    row=i; col=j;
                    found=true;
                    break;
                }
            }
            if(found)
                break;
        }
        if(!found){
            return true;
        }
        for (int i = 0; i < N; i++)
            if(isSafe(board,row,col,i+1)) {
                board[row][col]= i+1;
                if(solve(board)) return true;
                else
                    board[row][col]=0;
            }
        return false;
    }

    private static boolean isSafe(int[][] board,int row,int col,int num) {
        for(int i=0;i<N;i++){
            if(board[row][i]==num || board[i][col]==num) return false;
        }
        int size = 3;
        int box_row = row - row%size;
        int box_col = col - col%size;

        for (int i = box_row; i < box_row+size; i++) {
            for (int j = box_col; j<box_col+size; j++){
                if(board[i][j]==num) return false;
            }
        }
        return true;
    }
}
