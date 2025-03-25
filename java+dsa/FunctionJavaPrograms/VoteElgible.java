// A person is eligible to vote if his/her age is greater than or equal to 18. 
// Define a method to find out if he/she is eligible to vote.


import java.util.Scanner;

public class VoteElgible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter the age:");
        int age = in.nextInt();
        if (CheckElgibility(age)) {
            System.out.println("elgible");
        } else {
            System.out.println("not elgiblle");
        }
        in.close();
    }

    static boolean CheckElgibility(int n) {
        if (n >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
