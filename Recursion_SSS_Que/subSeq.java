package Recursion_SSS_Que;

import java.util.ArrayList;

public class subSeq{
    public static void main(String[] args) {
        subseq("","abc");
        // System.out.println(Subseq("","abc"));
        
    }

    static void subseq(String p , String up){
        if (up.isEmpty()){
            System.out.print(p + " ");
            return;
        }
        char ch = up.charAt(0);

        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> Subseq(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = Subseq(p+ch, up.substring(1));
        ArrayList<String> right = Subseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }
}