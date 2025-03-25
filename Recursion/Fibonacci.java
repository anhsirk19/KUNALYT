package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(5));
    }

    static int fibo(int n) {
        // if (n == 0) {
        //     return 0;
        // }
        // if (n == 1) {
        //     return 1;
        // }
        if(n < 2){
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
