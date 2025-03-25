package Bitwise_operators;

//to change the ith bit to 1
//1 -> 0  ,  0 -> 1
//0 or 1 = 1, 1 or 1 = 1


public class Set_ithbitOfnum {
    public static void main(String[] args) {
        System.out.println(set(21, 4));
    }
    static int set(int num, int n){
        int mask = 1 << (n-1);
        return num | mask ;
    }
}
