

import java.util.Scanner;

public class Paindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (isPalindrome(n)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        System.out.println(n);
        in.close();
    }

    static boolean isPalindrome(int n) {
        int rev = 0;
        int orginal = n;
        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }
        if (orginal == rev) {
            return true;
        }
        return false;
    }

    static boolean ispal(int n){
        int org = n;
        int rev = 0;
        while( n!= 0){
            int d = n % 10;
            rev = rev*10 + d;
            n = n/10;
        }
        if(rev == org){
            return true;
        }
        return false;
    }
}
