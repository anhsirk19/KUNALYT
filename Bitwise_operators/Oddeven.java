package Bitwise_operators;

// given a number find it is odd or even

public class Oddeven {
    public static void main(String[] args) {
        System.out.println(isOdd(46));
    }
    static boolean isOdd(int n){
        return (n&1) == 1;
    }
}
