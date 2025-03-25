// sum and product of two numbers



import java.util.Scanner;

public class SumAndPro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = Sum(a, b);
        System.out.println("sum:" + sum);

        int pro = Pro(a, b);
        System.out.println("product:" + pro);

        in.close();

    }

    static int Sum(int n1, int n2) {
        return n1 + n2;
    }

    static int Pro(int n1, int n2) {
        return n1 * n2;
    }
}
