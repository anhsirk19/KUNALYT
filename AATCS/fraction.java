package AATCS;


import java.util.Scanner;

public class fraction {

    // Method to find the greatest common divisor (GCD)
    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Method to add two fractions
    public static String addFractions(int num1, int den1, int num2, int den2) {
        // Find the least common multiple (LCM) of the denominators
        int lcm = (den1 * den2) / gcd(den1, den2);

        // Convert fractions to have the same denominator
        int newNum1 = num1 * (lcm / den1);
        int newNum2 = num2 * (lcm / den2);

        // Add the numerators
        int resultNum = newNum1 + newNum2;
        int resultDen = lcm;

        // Simplify the result
        int gcdResult = gcd(resultNum, resultDen);
        resultNum /= gcdResult;
        resultDen /= gcdResult;

        // Return the result as a string
        return resultNum + "/" + resultDen;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input first fraction
        System.out.print("Enter the numerator of the first fraction: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the denominator of the first fraction: ");
        int den1 = scanner.nextInt();

        // Input second fraction
        System.out.print("Enter the numerator of the second fraction: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the denominator of the second fraction: ");
        int den2 = scanner.nextInt();

        // Add fractions
        String result = addFractions(num1, den1, num2, den2);
        
        // Output the result
        System.out.println("The sum of the fractions is: " + result);
        
        scanner.close();
    }
}
