
import java.util.Scanner;
//counting number of times a digit ocuurs in a number
public class CountingOccurences {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter number:");
        int n = in.nextInt();
        System.out.print("enter digit:");
        int digit = in.nextInt();

        int count = 0;
        while (n != 0) {
            int d = n % 10;
            if (d == digit) {
                count++;
            }
            n = n / 10;
        }

        System.out.println(count);

        in.close();

    }
}
