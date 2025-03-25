package Strings;

public class q {
    public static void main(String[] args) {
        // String a = "sai";
        // String b = "sai";
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a==b);
        // System.out.println(a.equals(b));
        // String m = "dq";
        // String n = new String("dq");
        // System.out.println(m==n);
        // System.out.println(m.equals(n));

        // float a = 12.13579f;
        // System.out.printf("no %.3f", a);
        

        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < 26 ; i++){
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
    }
}
