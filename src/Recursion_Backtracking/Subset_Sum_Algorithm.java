package Recursion_Backtracking;


/**
 * here is an backtracking algorithm to find a subset from a given set whose sum add up to a given number.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Subset_Sum_Algorithm {
    private static int k;
    private static ArrayList<Integer> set ,subset;

    public static void main(String[] args) {
        set = new ArrayList<>();
        subset = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i< n; i++){
            set.add(input.nextInt());
        }
        k = input.nextInt();

        findSubset(0,0);

        System.out.println("Want to try another no. y/n: ");
        String check = input.next();
        if (check.equals("y") || check.equals("Y")) {
            main(null);
        } else {
            System.out.println("Thank You :) ");
            System.exit(0);
        }
    }

    private static boolean findSubset(int x,int sum) {
        if(sum==k){
            for(Integer integer : subset){
                System.out.print(integer+" ");
            }
            return true;
        }
        for(int i=x;i<set.size();i++){
            int p =set.get(i);
            if(sum<k){
                subset.add(p);
                sum+=p;
                if(findSubset(i+1,sum))
                    return true;
                sum-=p;
                subset.remove(subset.size()-1);
            }
        }
        return false;
    }
}
