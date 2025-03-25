///To calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter n");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int count = 2;
        int temp;
        while (count < n) {
            temp = b;
            b = a + b;
            a = temp;
            System.out.println(b);
            count++;
        }
        in.close();
    }
}
