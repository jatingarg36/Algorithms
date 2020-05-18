package fibonacci;

import java.util.Scanner;

public class Last_digit_sq_fibonacci_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long  n,k=60;
        n= input.nextInt();
        if(n%k==0){
            System.out.println(0);
        }
        else{
            long a,b, tmp;
            a = 0;
            b = 1;
            tmp =1;
            for(int i=2;i<n%k+1;i++){
                tmp = a + b;
                a = b % 10;
                b = tmp % 10;
            }
            System.out.println((tmp*(a+b))%10);}
    }
}
