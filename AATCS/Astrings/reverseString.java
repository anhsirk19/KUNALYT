package AATCS.Astrings;

import java.util.Stack;

public class reverseString {
    public static void main(String[] args) {
        String s = "HELLO";

        String rev = "";

        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            st.push(ch);
        }
        while(!st.isEmpty()){
            rev = rev + st.pop();
        }
        System.out.println(rev);
    }
}
