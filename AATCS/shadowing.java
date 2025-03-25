package AATCS;

public class shadowing {

    static int x = 100;
    public static void main(String[] args){
        shadow();
        System.out.println(x);
        x = 99;
        shadow();
        System.out.println(x);
    }
    static void shadow(){
        System.out.println(x);
    }
}
