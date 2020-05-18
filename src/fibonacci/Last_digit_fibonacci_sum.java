package fibonacci;

import java.util.Scanner;

public class Last_digit_fibonacci_sum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long n, m;   // n>=m
        long k = 60; // this is the pisano period for 10
        System.out.print("From: ");
        m = input.nextInt();
        System.out.print("To: ");
        n = input.nextInt();
        if (n == 0) {
            System.out.println(0);
            return;
        }
        m--;
        long a=0, b=1, tmp = 0, sum = 1, sum2 = 1;

        for (int i = 2; i < n % k + 3; i++) {
            tmp = a + b;
            a = b % 10;
            b = tmp % 10;
        }
        long tmp2 = 0;
        a = 0;
        b = 1;
        for (int i = 2; i < m % k + 3; i++) {
            tmp2 = a + b;
            a = b % 10;
            b = tmp2 % 10;
        }
        sum = tmp;
        sum2 = tmp2;
        sum = sum >= sum2 ? sum - sum2 : 10 + sum - sum2;
        System.out.println(sum % 10);
    }
}