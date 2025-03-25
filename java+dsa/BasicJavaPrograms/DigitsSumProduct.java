import java.util.Scanner;

public class DigitsSumProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int pro = 1;
        int sum = 0;
        while (n != 0) {
            int d = n % 10;
            pro *= d;
            sum += d;
            n = n / 10;
        }
        System.out.println("sum :" + sum);
        System.out.println("product :" + pro);

        in.close();
    }
}
