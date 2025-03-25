package Bitwise_operators;

//to change the ith bit to 0
//1 -> 0  ,  0 -> 0
//0 & 1 = 0, 1 & 1 = 0
//mask : 110111ex

public class Reset_ithbitOfNum {
    public static void main(String[] args) {
        System.out.println(reset(21, 5));
    }
    static int reset(int num, int n){
        int mask = ~(1 << (n-1));
        return num & mask ;
    }
}
