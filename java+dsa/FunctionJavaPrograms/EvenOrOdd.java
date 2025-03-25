// Define a program to find out whether a given number is even or odd.


import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the number:");

        int n = in.nextInt();

        EvenOrOd(n);

        in.close();

    }

    static void EvenOrOd(int p) {
        if ((p & 1) == 1) { // Bitwise AND of any odd number by 1 gives 1
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
