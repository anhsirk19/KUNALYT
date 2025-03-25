/*Write a program to print the sum of negative numbers, sum of positive even numbers 
and the sum of positive odd numbers from a list of numbers (N)
 entered by the user. The list terminates when the user enters a zero. */


import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int neg_sum = 0;
        int pos_even_sum = 0;
        int pos_odd_sum = 0;
        int n;
        do {
            n = in.nextInt();
            if (n < 0) {
                neg_sum += -n;
            } else {
                if (n % 2 == 0) {
                    pos_even_sum += n;
                } else {
                    pos_odd_sum += n;
                }
            }
        } while (n != 0);

        System.out.println("neg_sum" + neg_sum);
        System.out.println("pos_even_sum" + pos_even_sum);
        System.out.println("pos_odd_sum" + pos_odd_sum);

        in.close();
    }
}
