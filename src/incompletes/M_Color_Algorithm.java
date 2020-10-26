package incompletes;

import java.util.Scanner;
public class M_Color_Algorithm {
    private static int v;
    private static int[][] matrix;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        v=input.nextInt();
        matrix = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                matrix[i][j]=input.nextInt();
            }
        }
        findNoOfColor(1);
        printMatrix();
        System.out.println("color:: ");
        for(int i=0;i<v;i++){
            System.out.print(matrix[i][i]+" ");
        }
    }

    private static boolean findNoOfColor(int color) {
        for(int i=0;i<v;i++){
            if(i<1)
                matrix[i][i]=color;
            else
                matrix[i][i]=matrix[i-1][i];
            if(color==v){
                return true;
            }
            for(int j=i+1;j<v;j++){
                if(matrix[i][j]==1){
                    if(i>0){
                        if(matrix[i-1][j]==0){
                            matrix[i][j]=color-1;
                            matrix[j][i]=color-1;
                        }
                        else {
                            matrix[i][j]=color+1;
                            matrix[j][i]=color+1;
                        }
                    }
                    else{
                        matrix[i][j]=color+1;
                        matrix[j][i]=color+1;
                    }
                }
            }
            color++;
        }
        return false;
    }

    private static void printMatrix() {
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
