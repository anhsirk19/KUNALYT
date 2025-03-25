//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a value:");
        int a = in.nextInt();
        System.out.print("enter b value:");
        int b = in.nextInt();
        System.out.println("enter operator:");
        char c = in.next().charAt(0);
        if (c == '+') {
            System.out.println("sum is " + (a + b));
        } else if (c == '-') {
            System.out.println("differrence is " + (a - b));
        } else if (c == '*') {
            System.out.println("product is " + (a * b));
        } else if (c == '/') {
            System.out.println("division is " + (a / b));
        } else {
            System.out.println("enter the correct operator");
        }
        in.close();

    }
}
