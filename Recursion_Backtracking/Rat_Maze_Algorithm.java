package Recursion_Backtracking;

/**
 * this is an algorithm to find path from (0,0) to (n-1,n-1) on a NXN binary matrix.
 */

import java.util.Scanner;

public class Rat_Maze_Algorithm {
    private static byte[][] matrix;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n= input.nextInt();
        matrix = new byte[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j] = input.nextByte();
            }
        }
        if(findPath(0,0,n))
            printMatrix(n);
        else
            System.out.println("Not Possible");
    }

    private static boolean findPath(int x,int y,int n) {
        if(x==(n-1) && y==(n-1)){
            matrix[x][y]=2;
            return true;}
        for(int i=x;i<n;i++){
            for(int j = y; j<n; ++j){
                if(hasMove(i+1,j,n)){
                    matrix[i][j]=2;
                    if(findPath(i+1,j,n))
                        return true;
                    matrix[i][j]=1;
                }
                if(hasMove(i,j+1,n)){
                    matrix[i][j]=2;
                    if(findPath(i,j+1,n))
                        return true;
                    matrix[i][j]=1;
                }
                return false;
            }
        }
        return false;
    }

    private static boolean hasMove(int i,int j,int n) {
        if(i<n && j<n)
            return matrix[i][j]==1;
        return false;
    }
    private static void printMatrix(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}
