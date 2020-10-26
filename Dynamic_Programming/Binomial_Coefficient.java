package Dynamic_Programming;

import java.util.Scanner;

/**
 * An efficient dynamic programming algorithm to find binomial coefficient C(n,k).
 * time : O(k)
 * space : O(1)
 */
public class Binomial_Coefficient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,k;
        n = input.nextInt();
        k = input.nextInt();
        int p,tmp;
        p = n-k;
        tmp = p;
        int sum=1+tmp;
        for(int i=1;i<k;i++){
            tmp = (p+i)*tmp/(i+1);
            sum+=tmp;
        }
        System.out.println(sum);
    }
}
