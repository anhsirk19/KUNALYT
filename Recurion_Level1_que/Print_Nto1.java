package Recurion_Level1_que;

public class Print_Nto1 {
    public static void main(String[] args) {
        fun(8);
    }

    static void fun(int n){
        if(n == 0){
            return ;
        }
        System.out.print(n + " ");
        fun(n-1);
    }
}
