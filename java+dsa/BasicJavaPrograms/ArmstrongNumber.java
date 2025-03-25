
//To find Armstrong Number between two given number.
import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter a value:");
        int a = in.nextInt();
        System.out.println("enter b value:");
        int b = in.nextInt();

        for (int i = a; i < b; i++) {
            //taking one value at a time and checking if it is armstrong number or not
            int n = i;
            int count = 0;
            double sum = 0;
            int q = n;
            while (q != 0) {
                q = q / 10;
                count++;//count is number of digits
            }
            int orginal = n;
            while (n != 0) {
                int digit = n % 10;
                sum = sum + Math.pow(digit, count);
                n = n / 10;
            }
            if (sum == orginal) {
                System.out.println(orginal);
            }
        }

        in.close();
    }
}
