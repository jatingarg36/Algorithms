package Recursion_Backtracking;

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Sum_Algorithm {
    private static int n;
    private static ArrayList<Integer> set = new ArrayList<>();

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        for(int i=0;i<n;i++){
            set.add(input.nextInt());
        }
        System.out.println(set.get(1));
    }
}
