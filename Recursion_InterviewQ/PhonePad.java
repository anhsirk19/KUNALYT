package Recursion_InterviewQ;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
         pad("", "89");
         System.out.println(padCount("", "89"));
         ArrayList<String> list = padArrayList("", "12");
         System.out.println(list);
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int d = up.charAt(0) - '0';//this will convert "2" into 2
        for(int i = (d-1)*3 ; i < (d)*3 ; i++){
            if(i == 26){
                continue;
            }
            char ch = (char)('a' + i);
            pad(p + ch, up.substring(1));
        }
    }

    static ArrayList<String> padArrayList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p
            return list;
        }
        int d = up.charAt(0) - '0';//this will convert "2" into 2
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (d-1)*3 ; i < (d)*3 ; i++){
            if(i == 26){
                continue;
            }
            char ch = (char)('a' + i);
            ans.addAll(padArrayList(p+ch, up.substring(1)));
        }
        return ans;
    }

    static int padCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        int d = up.charAt(0) - '0';//this will convert "2" into 2
        for(int i = (d-1)*3 ; i < (d)*3 ; i++){
            if(i == 26){
                continue;
            }
            char ch = (char)('a' + i);
            count = count + padCount(p + ch, up.substring(1));
        }
        return count;
    }
}
