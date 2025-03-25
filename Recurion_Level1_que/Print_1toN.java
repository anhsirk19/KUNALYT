package Recurion_Level1_que;

public class Print_1toN {
    public static void main(String[] args) {
        fun(8);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        fun(n-1);
        System.out.print(n + " ");
    }
}
