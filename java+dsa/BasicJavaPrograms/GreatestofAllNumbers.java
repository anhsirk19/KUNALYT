//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class GreatestofAllNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int n;
        do {
            n = in.nextInt();
            if (n > max) {
                max = n;
            }
        } while (n != 0);
        if (max != Integer.MIN_VALUE) {
            System.out.println(max);
        } else {
            System.out.println("no numbers were entered");
        }

        in.close();
    }
}
