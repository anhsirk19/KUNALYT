
//find the largest of 3 numbers
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        // int max = a;
        // if(b > max){
        // max = b;
        // }
        // if(c > max){
        // max = c;
        // }
        // System.out.println(max);

        int max = Math.max(a, b);
        max = Math.max(max, c);

        System.out.println(max);

        in.close();
    }
}
