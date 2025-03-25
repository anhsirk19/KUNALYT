// Write a program to print the circumference and area of a circle 
// of radius entered by user by defining your own method.



import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter radius of the circle:");
        double r = in.nextDouble();
        System.out.println("perimeter:" + Perimeter(r));
        System.out.println("area:" + Area(r));
        in.close();
    }

    static double Perimeter(double r) {
        return 2 * Math.PI * r;
    }

    static double Area(double r) {
        return Math.PI * r * r;
    }
}
