// Define two methods to print the maximum and the 
// minimum number respectively among three numbers entered by the user.



import java.util.Scanner;

public class LargestAmong3Numbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter num1:");
        int num1 = in.nextInt();
        System.out.println("enter num2:");
        int num2 = in.nextInt();
        System.out.println("enter num3:");
        int num3 = in.nextInt();

        in.close();

        int largest = Largest(num1, num2, num3);
        System.out.println("largest number:" + largest);

        int smallest = Smallest(num1, num2, num3);
        System.out.println("Smallest number:" + smallest);
    }

    static int Largest(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        return max;
    }

    static int Smallest(int a, int b, int c) {
        int min = a;
        if (b < min) {
            min = b;
        }
        if (c < min) {
            min = c;
        }
        return min;
    }
}
