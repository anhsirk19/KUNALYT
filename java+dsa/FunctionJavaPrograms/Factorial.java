

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Factoria(n));
        in.close();
    }

    static int Factoria(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return n * Factoria(n - 1);
        }
    }
}
