package Strings;

public class Palindrome {
    public static void main(String[] args) {
        String s = "abrcba";
        System.out.println(ispalindrome(s));

    }
    static boolean ispalindrome(String str){
        for(int i = 0 ; i <= str.length() / 2 ; i++){
            str = str.toLowerCase();
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);
            if(start != end){
                return false;
            }
        }
        return true;
    }
}
