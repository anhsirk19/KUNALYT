package Recursion_SSS_Que;
import java.util.ArrayList;
public class subSeqAscii {
    public static void main(String[] args) {
        subseqAscii("","abc");
        System.out.println(SubseqAs("","abc"));
    }

    static void subseqAscii(String p , String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);

        subseqAscii(p+ch, up.substring(1));
        subseqAscii(p, up.substring(1));
        subseqAscii(p + (ch+0), up.substring(1));
    }

    static ArrayList<String> SubseqAs(String p , String up){
        if (up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);

        ArrayList<String> left = SubseqAs(p+ch, up.substring(1));
        ArrayList<String> right = SubseqAs(p, up.substring(1));
        ArrayList<String> last = SubseqAs(p + (ch+0), up.substring(1));

        left.addAll(right);
        left.addAll(last);
        return left;
    }
}
