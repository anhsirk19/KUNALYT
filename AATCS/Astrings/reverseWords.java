package AATCS.Astrings;

import java.util.*;

public class reverseWords {
    public static void main(String[] args) {
        String s = "this is an amazing program";

        Stack<String> st = new Stack<>();

        String str = "";

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                st.push(str);
                str = "";
            }else{
                str = str + s.charAt(i);
            }
        }
        st.push(str);

        s = "";
        while(!st.isEmpty()){
            s += st.pop();
            if(!st.isEmpty()){
                s += " ";
            }
        }
        System.out.println(s);
    }
}
