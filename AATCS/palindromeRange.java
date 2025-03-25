package AATCS;

import java.lang.*;
import java.util.*;
import java.io.*;

public class palindromeRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        for(int i = a ; i <= b ; i++){
            if(isPalindrome(i)){
                System.out.println(i);
            }
        }
        in.close();
    }
    static boolean isPalindrome(int n){
        int org = n;
        int rev = 0;
        while( n!= 0){
            int rem = n%10;
            rev = rev*10 + rem;
            n = n/10;
        }
        if(org == rev){
            return true;
        }
        return false;
    }
}
