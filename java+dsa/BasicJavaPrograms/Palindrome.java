import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the string:");
        String s = in.nextLine();
        String rev = "";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            rev = rev + s.charAt(n - i - 1);
        }
        System.out.println(rev);// == check for the references
        //while equals method check for the content
        if (s.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
        in.close();

        palindrome("sai as");
    }


    static void palindrome(String s){
        String rev = "";
        int n = s.length();

        for(int i = 0 ; i < n ; i++){
            rev = rev + s.charAt(n-i-1);
        }

        System.out.println(rev.equals(s));
    }
}
