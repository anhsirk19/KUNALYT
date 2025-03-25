package Recursion;

public class message {
    public static void main(String[] args) {
        Message();
    }
    static void Message(){
        System.out.println("hello0");
        message1();
    }
    static void message1(){
        System.out.println("hello1");
        message2();
    }
    static void message2(){
        System.out.println("hello2");
        message3();
    }
    static void message3(){
        System.out.println("hello3");
    }
}
