import java.util.Scanner;

public class NCRNPR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        System.out.println("ncr value:");
        int ans = Factorial(n) / (Factorial(n - r) * Factorial(r));
        System.out.println(ans);

        System.out.println("npr value:");
        int a = Factorial(n) / (Factorial(n - r));
        System.out.println(a);

        in.close();

    }
    /*for (int i = 0; i < r; i++) {
        res = res * (n - i); ncr
        res = res / (i + 1);
    }*/
    public static int Factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
