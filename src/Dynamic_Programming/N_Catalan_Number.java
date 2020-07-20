package Dynamic_Programming;

import java.util.Scanner;

public class N_Catalan_Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        n = input.nextInt();
        int[] a = new int[n+1];
        a[0]=1;
        a[1]=1;
        int sum;
        for(int i=1;i<n;i++){
            sum=0;
            for(int j=0;j<=i/2;j++){
                sum+=a[j]*a[i-j];
            }
            if(i%2==0){
                a[i+1]=2*sum-a[i/2]*a[i/2];
            }
            else{
                a[i+1]=2*sum;
            }
        }

        for(int i=0;i<n+1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
