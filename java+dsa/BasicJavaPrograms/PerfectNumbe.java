import java.util.Scanner;

public class PerfectNumbe {
    public static void main(String[] args) {
        // a perfect number is number which is equal to the sum of all the positive divisors except itself
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        if (sum == n) {
            System.out.println("perfect number");
        } else {
            System.out.println("not perfect");
        }
        in.close();


    }
}
