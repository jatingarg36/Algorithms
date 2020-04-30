package Recursion_Backtracking;

import java.util.Scanner;

public class N_Stairs_Alogrithm {
    private static int total_stairs;
    private static int ways = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of stairs: ");
        total_stairs=input.nextInt();
        step(0);
        System.out.println("Total number of ways to climb "+total_stairs+" stairs are "+ways);

    }

    private static void step(int stair) {
        if(stair == total_stairs){
            ways++;
        }
        else{
            if(total_stairs-stair>=1){
                stair++;
                step(stair);
                stair--;
            }
            if(total_stairs-stair>=2){
                stair+=2;
                step(stair);
                stair-=2;
            }
            if(total_stairs-stair>=3){
                stair+=3;
                step(stair);
                stair-=3;
            }
        }
    }
}
