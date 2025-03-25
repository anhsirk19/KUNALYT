//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)


import java.util.Scanner;

public class SumofAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int n;
        do {
            n = in.nextInt();
            sum += n;
        } while (n != 0);
        System.out.println(sum);

        in.close();
    }
}
