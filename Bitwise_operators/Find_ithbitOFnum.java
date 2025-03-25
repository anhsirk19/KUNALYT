package Bitwise_operators;

//find ith bit of a number
//  1 0 0 1 1 0 0
//  0 0 0 1 0 0 0 (mask)(1 << n-1)shift

public class Find_ithbitOFnum {
    public static void main(String[] args) {
        System.out.println(ans( 21 , 5));
    }
    static int ans(int num, int n){
        int mask = 1 << (n-1);
        return (num & mask) >> (n-1);
    }
}
