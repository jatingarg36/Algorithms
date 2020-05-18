package fibonacci;

import java.util.Scanner;

public class PinasoPeriod {
    private static long pisanoPeriod(long m) {

        long a=0,b=1,period=0;
        for(int i=0;i<m*m;i++){
            long tmp=a%m+b%m;
            a=b%m;
            b=tmp%m;
            period++;
            if(a==0 &&b==1)
                break;
        }
        return period;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long a,b,result = 0,n,m;
        System.out.print("Enter N: ");
        n = input.nextInt();
        System.out.print("Enter M: ");
        m = input.nextInt();
        a=0;
        b=1;
        long period= pisanoPeriod(m);
        if(n%period==0)
            System.out.println(0);
        else if(n%period==1){
            System.out.println(1);
        }
        else {
            for (int i = 2; i < n % period + 1; i++) {
                result = a % m + b % m;
                a = b;
                b = result % m;
            }
            System.out.println(result%m);
        }
    }
}
