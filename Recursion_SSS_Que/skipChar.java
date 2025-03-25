package Recursion_SSS_Que;

public class skipChar {
    public static void main(String[] args) {
        //all a's are remove from the string
        skip("", "baccadsaea");
        System.out.println(skip("awqdvbbcvsa"));
    }
    //passing as argument
    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            skip(p, up.substring(1));
        }else{
            skip(p + ch, up.substring(1));
        }
    }

    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }
}
