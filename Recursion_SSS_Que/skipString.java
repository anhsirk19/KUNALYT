package Recursion_SSS_Que;

public class skipString {
    public static void main(String[] args) {
        System.out.println(skipApple("abncppdapplef"));
        System.out.println(skipAppNotApple("qwdappapple"));
    }
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return ch + skipApple(up.substring(1));
        }
    }

    static String skipAppNotApple(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppNotApple(up.substring(3));
        }else{
            return ch + skipAppNotApple(up.substring(1));
        }
    }
}
